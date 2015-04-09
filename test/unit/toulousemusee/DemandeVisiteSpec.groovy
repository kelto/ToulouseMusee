package toulousemusee

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(DemandeVisite)
class DemandeVisiteSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "test DemandeVisite"() {
        given: "Une Demande de Visite"
        Date now = new Date()
        DemandeVisite demandeVisite = new DemandeVisite(code: unCode, dateDebutPeriode: now, dateFinPeriode: now,
        nbPersonnes: nb, statut: unStatut)

        expect: "Validation"
        demandeVisite.validate() == true

        where:
        unCode  |   nb  |   unStatut
        1       | 4     |   "Attente"
        1       | 6     |   "Attente"
        1       | 1     |   "Attente"
    }

    void "test fail"() {
        given: "Une Demande de Visite"
        Date now = new Date()
        DemandeVisite demandeVisite = new DemandeVisite(code: unCode, dateDebutPeriode: now, dateFinPeriode: now,
                nbPersonnes: nb, statut: unStatut)

        expect: "Validation"
        demandeVisite.validate() == false

        where:
        unCode  |   nb  |   unStatut
        1       | 0     |   "Attente"
        1       | 7     |   "Attente"
    }
}
