package toulousemusee

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Adresse)
class AdresseSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "test adresse"() {
        given: "Une adresse"
        Adresse adresse = new Adresse(numero: unNumero, rue: uneRue, codePostal: unCode,ville: uneVille)

        expect: "est valide"
        adresse.validate() == true

        where:
        unNumero    |   uneRue      |   unCode  |   uneVille
        9           |   "rue test"  |   "31000" | "Toulouse"
    }
}
