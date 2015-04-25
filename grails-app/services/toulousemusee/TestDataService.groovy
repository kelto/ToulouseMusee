package toulousemusee

import grails.transaction.Transactional

@Transactional
class TestDataService {

    def insertData() {
        Adresse ad = new Adresse(numero: 9, rue: "jacqueline", codePostal: "31400",ville: "Toulouse")
        ad.save(flush: true)
        Gestionnaire g = new Gestionnaire(nom: "Charles")
        g.save(flush: true)
        Musee test = new Musee(nom: "Salut", adresse: ad, telephone: "06",
                accesBus: "Rangueil", accesMetro: "Rangueil", gestionnaire: g, horairesOuverture: "9h-16h")
        test.save(flush: true)
        Musee test2 = new Musee(nom: "Second", adresse: ad, telephone: "07",
        accesBus: "Empalot", accesMetro: "Empalot", gestionnaire: g, horairesOuverture: "10h-18h")
        test2.save(flush: true)

    }
}
