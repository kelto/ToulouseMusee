package toulousemusee

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Musee)
class MuseeSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "test validité d'un musee"() {
        given: "Un musee initialise avec tous ses parametres non vides"
        Gestionnaire unGestionnaire = Mock(Gestionnaire)
        Adresse uneAdresse = Mock(Adresse)
        Musee musee = new Musee(nom: unNom, adresse: uneAdresse, telephone: unTel,
        accesBus: unAccesBus, accesMetro: unAccesBus, gestionnaire: unGestionnaire, horairesOuverture: horaire)

        expect: "le musee est valide"
        musee.validate()

        where:
        unNom   |   unTel   |   unAccesBus  |   horaire
        "Musee" |   "0"     |   "Rangueil"  |   "9h-18h"
    }
}
