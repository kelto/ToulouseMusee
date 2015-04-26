package toulousemusee

class VisiteController {

    DemandeVisiteService demandeVisiteService
    def index() {
    }

    def visite() {
        def debut= params.debut
        def fin = params.fin
        def nb = params.nb

        Musee musee=Musee.findByNom(session.getAttribute("nomMusee"))
        DemandeVisiteMusee demandeVisiteMusee=new DemandeVisiteMusee(dateDemande: new Date())
        String code=session.getId() + new GregorianCalendar().getTimeInMillis().toString()
        println(debut)
        println(fin)
        println(nb)
        println(code)
        println(musee.nom)
        DemandeVisite demandeVisite=new DemandeVisite(dateDebutPeriode: debut, dateFinPeriode: fin, nbPersonnes: nb, statut: DemandeVisite.TO_BE_TREATED, code: code)

        demandeVisiteService.addVisite(demandeVisite,demandeVisiteMusee,musee)
        session.setAttribute("code",code)

        render(view : "resultatDemande")
    }
}
