import toulousemusee.MuseeCSVService

class BootStrap {

    MuseeCSVService mCSV
    def init = { servletContext ->

        mCSV.createContext()
    }
    def destroy = {
    }
}
