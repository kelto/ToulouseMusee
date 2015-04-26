package toulousemusee

import grails.transaction.Transactional

@Transactional
class DemandeVisiteService {
    private static final int NB_CHAR_CODE = 8;


    MuseeService museeService

    def wrongAddVisite(DemandeVisite demandeVisite, DemandeVisiteMusee demandeVisiteMusee, Musee musee) {
        musee.id ? null : museeService.insertOrUpdateMusee(musee, musee.adresse, musee.gestionnaire)
        if (demandeVisite.id == null) {
            if (demandeVisite.save(flush: true) == null) println("error demandeVisite save")
        }

        demandeVisiteMusee.musee = musee
        demandeVisiteMusee.demandeVisite = demandeVisite

        demandeVisiteMusee.save(flush: true)
        demandeVisite
    }

    def addVisite(List<Integer> listId, Date debut, Date fin, int nb) {
        Random random = new Random();
        String c = "";
        for (int i = 0; i < NB_CHAR_CODE; i++) {
            c += random.nextInt(10).toString();
        }
        //Not the best things i would think of ...
        while (DemandeVisite.findByCode(c) != null) {
            c = "";
            for (int i = 0; i < NB_CHAR_CODE; i++) {
                c += random.nextInt(10).toString();
            }
        }

        //Creating the DemandeVisite and saving it
        DemandeVisite visite = new DemandeVisite(code: c, dateDebutPeriode: debut, dateFinPeriode: fin, nbPersonnes: nb, statut: DemandeVisite.TO_BE_TREATED)
        if (visite.save(flush: true) == null) {
            println "failed to save visite"
        }
        // The date of the Demande
        Date now = new Date()
        // For each Musee, create a DemandeVisiteMusee, which is bound to the DemandeVisite previously created.
        // and save it.
        listId.each {
            println "it: " + it
            println "it.class: " + it.class
        }
        /*
        println id
        Musee musee = Musee.findById(id)
        if(musee == null) {
            println "couldn't find musee"
        }
        */
        listId.each {
            if (new DemandeVisiteMusee(demandeVisite: visite, dateDemande: now, musee: Musee.findById(it)).save(flush: true, failOnError: true) == null) {
                println "failed to save visiteMusee"
            } else {
                println "success"
            }

        }
        visite
    }

    def getVisite(String code) {
        def all = DemandeVisite.findAll()

        //def dv = DemandeVisite.findByCode("${code}")
        def dv = DemandeVisite.findByCode(code)

        dv

    }
}
