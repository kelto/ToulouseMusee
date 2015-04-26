package toulousemusee

class DemandeVisite {

    int code;
    Date dateDebutPeriode;
    Date dateFinPeriode;
    int nbPersonnes;
    String statut;

    static constraints = {
        code blank: false, unique: true
        statut blank: false
        nbPersonnes min: 1, max: 6
    }
}
