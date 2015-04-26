package toulousemusee

class DemandeVisiteMusee {
    DemandeVisite demandeVisite;


    static belongsTo = [
            demandeVisite : DemandeVisite,
            musee : Musee
    ]

    static mapping = {
        musee fetch: "join"
    }
    static constraints = {
    }
}
