package toulousemusee



import spock.lang.*

import javax.servlet.http.HttpSession

/**
 *
 */
class MuseesFavorisServiceIntegrationSpec extends Specification {

    MuseesFavorisService museesFavorisService;

    def setup() {
    }

    def cleanup() {
    }

    void "test ajout Musee"() {

        given: "Un musee"

        Gestionnaire gestionnaire = new Gestionnaire(nom: "Franck")
        gestionnaire.save(flush: true, failOnError: true)

        Adresse uneAdresse = new Adresse(numero: 5, rue: "avenue bongrelle", codePostal: "31000", ville: "Toulouse")
        uneAdresse.save(flush: true, failOnError: true)

        Musee musee = new Musee(nom: "musee", horairesOuverture: "9h-17h", accesMetro: "Rangueil",
        accesBus: "Rangueil", telephone: "05 67 73 84 84", gestionnaire: gestionnaire, adresse: uneAdresse )
        musee.save(flush: true, failOnError: true)

        and: "Un utilisateur"
        Utilisateur utilisateur = new Utilisateur(nom:"Dupond", prenom: "Martin")
        utilisateur.save(flush: true, failOnError: true)

        when: "on ajoute aux favoris"
        MuseeFavoris fav = museesFavorisService.addTofavorites(musee,utilisateur)

        then: "Le favoris existe"
        fav != null

        and: "le favoris n'a pas d'erreur"
        println "**********"
        println fav.getErrors().toString()
        println "**********"
        !fav.hasErrors()

        and: "le favoris a un id"
        fav.id

        and: "le favoris est bien présent dans la bdd"
        MuseeFavoris.findById(fav.id) != null

        and: "Le favoris a bien pour utilisateur celui passé en paramètre"
        fav.utilisateur == utilisateur

        and: "Le favoris a bien pour musee celui passé en paramètre"
        fav.musee == musee

    }

    void "test suppression activite"(){
        given: "un favoris existante en base"
        Gestionnaire gestionnaire = new Gestionnaire(nom: "Franck").save();
        Adresse uneAdresse = new Adresse(numero: 5, rue: "avenue bongrelle", codePostal: "31000", ville: "Toulouse")
                .save()
        Musee musee = new Musee(nom: "musee", horairesOuverture: "9h-17h", accesMetro: "Rangueil",
                accesBus: "Rangueil", telephone: "05 67 73 84 84", gestionnaire: gestionnaire, adresse: uneAdresse )
                .save()
        Utilisateur utilisateur = new Utilisateur(nom: "Dupont", prenom: "Jeanne").save()
        MuseeFavoris fav = museesFavorisService.addTofavorites(musee,utilisateur)
        when:"on tente de supprimer l'activité"
        museesFavorisService.removeFromFavorites(musee, utilisateur)
        then:"l'activite n'existe plus en base"
        MuseeFavoris.findById(fav.id) == null

    }

}
