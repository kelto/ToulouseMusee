package toulousemusee

class VisiteController {

    MuseeService museeService
    MuseesFavorisService museesFavorisService
    DemandeVisiteService demandeVisiteService
    def index() {
        [favoris: museesFavorisService.getFavorites(session)]
    }

    def visite() {
        def debut,fin
        demandeVisiteService.addVisite(Musee.findById(params.int("id")),)
    }
}
