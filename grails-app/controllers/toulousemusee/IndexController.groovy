package toulousemusee

class IndexController {

    MuseesFavorisService museesFavorisService

    static allowedMethods = [addToFavorites: "POST",  removeFromFavorites: "GET"]

    def index() {
        if(session.getAttribute("favoris") == null) {
            ArrayList<Musee> list = new ArrayList<>();
            Musee musee = Musee.findByNom("Salut")
            list.add(musee)
            list.add(Musee.findByNom("Second"))
            session.setAttribute("favoris", list)

        }
        List<Musee> fav = session.getAttribute("favoris");

        [favoris: session.getAttribute("favoris") as List<Musee>]
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
