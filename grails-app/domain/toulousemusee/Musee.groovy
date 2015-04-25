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
        gestionnaire blank: false, unique: true
    }

    public boolean equals(Musee musee) {
        if(this.is(musee)) {
            return true;
        }
        return this.id == musee.id
    }
}
