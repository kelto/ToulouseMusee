
import toulousemusee.Adresse
import toulousemusee.Gestionnaire
import toulousemusee.Musee
import toulousemusee.TestDataService

class BootStrap {

    TestDataService testDataService

    def init = { servletContext ->
        testDataService.insertData()
    }
    def destroy = {
    }
}
