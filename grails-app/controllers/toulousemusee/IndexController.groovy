package toulousemusee

class IndexController {

    MuseesFavorisService museesFavorisService
    MuseeService museeService

    //static allowedMethods = [addToFavorites: "POST",  removeFromFavorites: "GET", search: "POST"]

    def index() {
        def l = museesFavorisService.getFavorites(session)

        [favoris: museesFavorisService.getFavorites(session)]
    }

    def search(){
        def listMusee = museeService.searchMusee(params.nom,params.codePostal,params.rue)
        render(view: 'index', model: [favoris: session.favoris, searchList: listMusee])
    }


    def addToFavorites() {
        museesFavorisService.addTofavorites(params.int('id'), session)
        render(view: 'index', model: [favoris: session.getAttribute("favoris") as List<Musee>])
    }

    def removeFromFavorites() {
        museesFavorisService.removeFromFavorites(params.int('id'),session)
        render(view: 'index', model: [favoris: session.getAttribute("favoris") as List<Musee>])
    }
}
