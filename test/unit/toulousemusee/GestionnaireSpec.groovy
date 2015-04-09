package toulousemusee

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Gestionnaire)
class GestionnaireSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "test Gestionnaire"() {

        given: "Un gestionnaire"
        Gestionnaire gestionnaire = new Gestionnaire(nom: "Dupond")

        expect: "est valide"
        gestionnaire.validate() == true

    }
}
