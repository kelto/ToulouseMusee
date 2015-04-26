package toulousemusee



import spock.lang.*

/**
 *
 */
class DemandeVisiteServiceIntegrationSpec extends Specification {

    DemandeVisiteService demandeVisiteService
    TestDataService testDataService

    def setup() {
    }

    def cleanup() {
    }

    void "test service"() {
        given: "une demande"
        Calendar c = new GregorianCalendar(2015,7,23,16,30)
        Date debut = c.getGregorianChange()
        c.set(2015,7,30,17,0)
        Date fin = c.getGregorianChange()
        int nb = DemandeVisiteMusee.count()
        testDataService.insertData()
        Musee m = Musee.findByNom("Second")

        when: "on ajoute une demande"
        demandeVisiteService.addVisite(m,debut,fin,4)

        then: "il est inséré dans la base de donee"
        DemandeVisiteMusee.count() == (nb+1)
    }
}
