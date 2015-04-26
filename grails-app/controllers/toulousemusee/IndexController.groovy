package toulousemusee

class IndexController {

    MuseesFavorisService museesFavorisService
    MuseeService museeService

    //static allowedMethods = [addToFavorites: "POST",  removeFromFavorites: "GET", search: "POST"]

    def index() {
        def l = museesFavorisService.getFavorites(session)

        [favoris: museesFavorisService.getFavorites(session)]
    }

    def toSearch(){
        session.setAttribute("nom",params.nom)
        session.setAttribute("codePostal",params.codePostal)
        session.setAttribute("rue",params.rue)
        search()
    }

    def search(){
        if(session.getAttribute("page")==null)
            session.setAttribute("page",0)
        println(session.getAttribute("codePostal"))
        def listMusee = museeService.searchMusee(session.getAttribute("nom"),session.getAttribute("codePostal"),session.getAttribute("rue"),session.getAttribute("page"))

        if (listMusee.size() == Musee.MAX+1) {
            listMusee.remove(Musee.MAX)
            session.setAttribute("nextPage", true)
        }
        else{
            session.setAttribute("nextPage",false)
        }
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

    def demandeVisite(){
        session.setAttribute("nomMusee",params.name)
        render(view: '/visite/visite')
    }

    def next(){
        if(session.getAttribute("nextPage"))
            session.setAttribute("page",session.getAttribute("page")+1)
        search()
    }
    def previous(){
        if(session.getAttribute("page")>0)
            session.setAttribute("page",session.getAttribute("page")-1)
        search()
    }
}
