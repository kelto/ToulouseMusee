package toulousemusee

import grails.transaction.Transactional


@Transactional
class MuseesFavorisService {


    def addTofavorites(Musee musee, Utilisateur utilisateur) {
        musee.save(flush: true)
        utilisateur.save(flush: true)
        MuseeFavoris fav = new MuseeFavoris(musee: musee, utilisateur: utilisateur)

        fav.save(flush: true)

        fav
    }

    def removeFromFavorites(Musee musee, Utilisateur utilisateur) {
        MuseeFavoris fav = MuseeFavoris.findByMuseeAndUtilisateur(musee,utilisateur)
        fav.delete(flush: true)

    }

    def getFavorites(Utilisateur utilisateur) {
     MuseeFavoris.findAllByUtilisateur(utilisateur)
    }


}
