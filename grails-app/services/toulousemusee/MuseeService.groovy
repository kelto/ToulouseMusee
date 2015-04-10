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



}
