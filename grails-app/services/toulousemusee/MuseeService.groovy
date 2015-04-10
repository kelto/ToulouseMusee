package toulousemusee

import grails.transaction.Transactional

@Transactional
class MuseeService {

    def serviceMethod() {

    }

    List<Musee> searchMusee(String nom, String codePostal, String rue){
        def musee = Musee.createCriteria()
        def res = musee.list {
            if(nom){
                like('nom',"%${nom}%")
            }
            order('nom',"desc")
        }
        res
    }

    def insertOrUpdateMusee(Musee musee,Adresse adresse, Gestionnaire gestionnaire){

        musee.gestionnaire=gestionnaire
        musee.adresse=adresse
        musee.save(flush: true)

        return musee
    }

    def deleteMusee(Musee musee){
        musee.delete(flush: true)
    }
}
