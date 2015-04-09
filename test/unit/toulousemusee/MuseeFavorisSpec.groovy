package toulousemusee

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(MuseeFavoris)
class MuseeFavorisSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "test MuseeFavoris"() {
        given: "Un Musee en favoris"
        MuseeFavoris museeFavoris = new MuseeFavoris(musee: unMusee, utilisateur: unUtilisateur)

        expect: "Validation"
        museeFavoris.validate() == true

        where:
        unMusee     | unUtilisateur
        Mock(Musee) | Mock(Utilisateur)
    }
}
