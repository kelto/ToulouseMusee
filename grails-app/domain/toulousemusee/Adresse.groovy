package toulousemusee

class Adresse {
    int numero;
    String rue;
    String codePostal
    String ville

    static constraints = {
        rue blank: false
        codePostal blank: false
        ville blank: false
    }
}
