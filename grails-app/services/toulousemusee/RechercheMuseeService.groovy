package toulousemusee

import grails.transaction.Transactional

@Transactional
class RechercheMuseeService {

    def serviceMethod() {

    }

    List<Musee> searchMusee(String likeNom, String likeCodePostal, String likeRue){
        def musee = Musee.createCriteria()
        def res = musee.list {
            if(likeNom){
                like 'nom', "%${likeNom}%"
            }
            if(likeCodePostal) {
                adresse {
                    like 'codePostal', "%${likeCodePostal}%"
                }
            }
            if(likeRue) {
                adresse {
                    like 'rue', "%${likeRue}%"
                }
            }
        }
        res
    }



}
