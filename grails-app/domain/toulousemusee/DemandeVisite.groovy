package toulousemusee

class DemandeVisite {

    public static final String TO_BE_TREATED = "in treatment",
                                TREATED = "treated";
    int code;
    Date dateDebutPeriode;
    Date dateFinPeriode;
    int nbPersonnes;
    String statut;

    static constraints = {
        statut blank: false
        nbPersonnes min: 1, max: 6
    }
}
