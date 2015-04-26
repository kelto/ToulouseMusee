package toulousemusee

import grails.transaction.Transactional

@Transactional
class DemandeVisiteService {
    private static final int NB_CHAR_CODE = 4;

    def addVisite(Musee m,Date debut, Date fin, int nb) {
        println "********************************************"
        println "begin"
        Random random = new Random();
        println "random created"
        String c = "";
        for(int i = 0; i < NB_CHAR_CODE; i++) {
            c += random.nextInt(10).toString();
        }
        println "code created"
        DemandeVisite visite = new DemandeVisite(code: c, dateDebutPeriode: debut, dateFinPeriode: fin, nbPersonnes: nb, statut: DemandeVisite.TO_BE_TREATED)
        println "visite created"
        DemandeVisiteMusee visiteMusee = new DemandeVisiteMusee(dateDemande: new Date(),musee: m, demandeVisiste: visite)
        println "visite musee created"
        visite.save(flush: true)
        println "visite saved"
        visiteMusee.save(flush: true)
        println "visite musee saved"
        println "success"

    }
}
