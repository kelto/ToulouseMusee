package toulousemusee

class Musee {

    String nom;
    String horairesOuverture
    String telephone
    String accesMetro
    String accesBus
    Gestionnaire gestionnaire
    Adresse adresse

    static constraints = {
        nom blank: false
        horairesOuverture blank: false
        telephone blank: false
        accesMetro blank: false
        accesBus blank: false
    }
}
