package toulousemusee

import grails.transaction.Transactional

import javax.servlet.http.HttpSession


@Transactional
class MuseesFavorisService {

    def getFavorites(HttpSession session) {
        if(session.getAttribute("favoris") == null) {
            ArrayList<Musee> list = new ArrayList<>()
            session.setAttribute("favoris", list)

        }

        return session.getAttribute("favoris")
    }

    def addTofavorites(Integer id, HttpSession session) {
        List<Musee> museeList = session.getAttribute("favoris") as List<Musee>
        boolean exist = false
        museeList.each {
            if(it.id == id) { exist = true }
        }
        if (!exist) {
            museeList.add(Musee.findById(id))
            session.setAttribute("favoris", museeList)
        }

    }

    def removeFromFavorites(Integer id, HttpSession session) {

        List<Musee> museeList = session.favoris as List<Musee>
        museeList.removeAll {
            it.id == id
        }
        session.setAttribute("favoris",museeList)

    }


}
