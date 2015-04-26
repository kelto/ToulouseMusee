package toulousemusee

class Musee {

    String nom;
    String horairesOuverture
    String telephone
    String accesMetro
    String accesBus
    static final int MAX=5

    static belongsTo = [
            gestionnaire :Gestionnaire,
            adresse: Adresse
    ]

    static mapping = {
        gestionnaire fetch: "join"
        adresse fetch: "join"
    }

    static constraints = {
        nom blank: false
        horairesOuverture blank: false
        telephone blank: false
        gestionnaire blank: false
    }

}
