package toulousemusee

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Utilisateur)
class UtilisateurSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "test Utilisateur"() {
        given: "Un utilisateur"
        Utilisateur utilisateur = new Utilisateur(nom: unNom, prenom: unPrenom)

        expect: "Validation"
        utilisateur.validate() == true;

        where:
        unNom       | unPrenom
        "Dupond"    | "Martin"

    }

    void "test fail"() {
        given: "Un utilisateur"
        Utilisateur utilisateur = new Utilisateur(nom: unNom, prenom: unPrenom)

        expect: "Validation"
        utilisateur.validate() == false;

        where:
        unNom       | unPrenom
        "Dupond"    | ""
        ""          | "Martin"
        _           | "Martin"
        "Dupond"    | _
    }
}
