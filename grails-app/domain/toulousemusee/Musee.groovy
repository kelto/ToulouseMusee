package toulousemusee

class Musee {

    String nom;
    String horairesOuverture
    String telephone
    String accesMetro
    String accesBus
    Gestionnaire gestionnaire
    Adresse adresse
    static final int MAX=5

    static constraints = {
        nom blank: false
        horairesOuverture blank: false
        telephone blank: false
        gestionnaire blank: false
    }

}
