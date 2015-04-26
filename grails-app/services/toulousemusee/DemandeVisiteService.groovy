package toulousemusee

import grails.transaction.Transactional

@Transactional
class DemandeVisiteService {

    MuseeService museeService
    def addVisite(DemandeVisite demandeVisite, DemandeVisiteMusee demandeVisiteMusee, Musee musee) {
        musee.id ? null : museeService.insertOrUpdateMusee(musee,musee.adresse,musee.gestionnaire)
        if(demandeVisite.id==null){ if(demandeVisite.save(flush: true)==null)println("error demandeVisite save")}

        demandeVisiteMusee.musee=musee
        demandeVisiteMusee.demandeVisite=demandeVisite

        demandeVisiteMusee.save(flush:true)
        demandeVisite
    }
}
