package toulousemusee

import grails.transaction.Transactional

@Transactional
class MuseeService {

    def serviceMethod() {

    }

    List<Musee> searchMusee(String likeNom, String likeCodePostal, String likeRue, int page){

        def musee = Musee.createCriteria()

        def first=Musee.MAX*page
        def last=Musee.MAX+1

        def res = musee.list(max:last, offset:first) {
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
