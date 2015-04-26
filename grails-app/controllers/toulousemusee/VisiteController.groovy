package toulousemusee

class VisiteController {

    DemandeVisiteService demandeVisiteService
    MuseesFavorisService museesFavorisService

    def index() {
        [favoris: museesFavorisService.getFavorites(session)]
    }

    def visite() {
        def debut= params.debut
        def fin = params.fin
        def nb = params.int('nb')
        def listBox = params.list('museeId')

        def visite = demandeVisiteService.addVisite(listBox,debut,fin,nb)

        render(view : "resultatDemande", model:[code: visite.code])
    }
}
