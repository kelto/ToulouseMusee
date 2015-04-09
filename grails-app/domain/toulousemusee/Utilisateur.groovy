package toulousemusee

class Utilisateur {

    String nom
    String prenom

    static constraints = {
        nom blank: false
        prenom blank: false
    }
}
