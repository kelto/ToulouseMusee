package toulousemusee

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(DemandeVisiteMusee)
class DemandeVisiteMuseeSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "test validation"() {
        given: "Une demande de visite pour un musee"
        Date now = new Date()
        DemandeVisiteMusee demandeVisiteMusee = new DemandeVisiteMusee(musee: unMusee, demandeVisiste: uneDemande, dateDemande: now)

        expect: "validation"
        demandeVisiteMusee.validate() == true

        where:
        unMusee     | uneDemande
        Mock(Musee) | Mock(DemandeVisite)
    }
}
