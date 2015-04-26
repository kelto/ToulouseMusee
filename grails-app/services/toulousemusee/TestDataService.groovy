package toulousemusee

import grails.transaction.Transactional

@Transactional
class TestDataService {

    def insertData() {
        Adresse adresse0=new Adresse(numero: "2",rue: "Rue des archives", codePostal: "31500",ville: "TOULOUSE")
        Adresse adresse1=new Adresse(numero: "5",rue: "Rue Saint Pantaleon",codePostal: "31000",ville: "TOULOUSE")
        Adresse adresse2=new Adresse(numero: "69",rue: "Rue Pargaminieres",codePostal: "31000",ville: "TOULOUSE")
        Adresse adresse3=new Adresse(numero: "31",rue: "Rue de la fonderie",codePostal: "31000",ville: "TOULOUSE")
        Adresse adresse4=new Adresse(numero: "",rue: "Rue Montmorency",codePostal: "31200",ville: "TOULOUSE")
        Adresse adresse5=new Adresse(numero: "2",rue: "Rue Viguerie",codePostal: "31300",ville: "TOULOUSE")
        Adresse adresse6=new Adresse(numero: "21",rue: "Rue de Metz",codePostal: "31000",ville: "TOULOUSE")
        Adresse adresse7=new Adresse(numero: "2",rue: "Rue Tripiere",codePostal: "31000",ville: "TOULOUSE")
        Adresse adresse8=new Adresse(numero: "7",rue: "Rue du May",codePostal: "31000",ville: "TOULOUSE")
        Adresse adresse9=new Adresse(numero: "",rue:"Rue du Japon",codePostal: "31400",ville:  "TOULOUSE")
        Adresse adresse10=new Adresse(numero: "13",rue: "Rue de la peau",codePostal: "31000",ville: "TOULOUSE")

        adresse0.save(flush: true)
        adresse1.save(flush: true)
        adresse2.save(flush: true)
        adresse3.save(flush: true)
        adresse4.save(flush: true)
        adresse5.save(flush: true)
        adresse6.save(flush: true)
        adresse7.save(flush: true)
        adresse8.save(flush: true)
        adresse9.save(flush: true)
        adresse10.save(flush: true)

        Gestionnaire mairie=new Gestionnaire(nom: "Mairie de TOULOUSE - DGA Culture")
        Gestionnaire association=new Gestionnaire(nom: "Association")
        Gestionnaire institution=new Gestionnaire(nom: "Autre institution publique")
        Gestionnaire structure=new Gestionnaire(nom: "Structure commerciale")

        mairie.save(flush: true)
        association.save(flush: true)
        institution.save(flush: true)
        structure.save(flush: true)

        Musee musee0=new Musee(nom: "ARCHIVES MUNICIPALES TOULOUSE",horairesOuverture: "Ouvert du lundi au vendredi de 9h à 17h. Fermeture de 12h à 13h30 pendant toutes les vacances scolaires. Fermeture annuelle la dernière quinzaine de juillet.",telephone: "05 61 61 63 33",accesMetro: "Roseraie (A)",accesBus: "36, 38")
        Musee musee1=new Musee(nom: "CMAV - CENTRE MERIDIONAL DE L'ARCHITECTURE DE LA VILLE",horairesOuverture: "Ouvert du mardi au samedi de 13h à 19hfermé les dimanches, jours fériés et du 1er au 15 août",telephone: "05 61 23 30 49",accesMetro: "Capitole (A), Jean Jaurès (B)",accesBus: "ncv, 2, 10, 12, 14, 38, 78 et 80")
        Musee musee2=new Musee(nom: "ENSEMBLE CONVENTUEL DES JACOBINS",horairesOuverture: "Ouvert tous les jours de 9h à 19h.",telephone: "05 61 22 21 92", accesMetro: "Esquirol, Capitole (A)",accesBus: "NCV, 2, 10, 12, 14, 38, 78, 80")
        Musee musee3=new Musee(nom: "INSTITUT CATHOLIQUE DE TOULOUSE - ESPACE MUSEOGRAPHIQUE BACCRABERE -",horairesOuverture:"Ouvert le premier vendredi de chaque mois de 18h à 20h.",telephone: "05 61 36 81 12",accesMetro:"Carmes (B)",accesBus: "2, 38")
        Musee musee4=new Musee(nom: "L'AEROTHEQUE",horairesOuverture: "Ouvert le lundi et le mercredi de 14h à 17h et le mardi de 9h à 12h",telephone:"05 61 93 93 57",accesMetro: "",accesBus: "15")
        Musee musee5=new Musee(nom: "MUSEE DE L'HISTOIRE DE LA MEDECINE DE TOULOUSE",horairesOuverture: "Ouvert tous les jeudi et vendredi de 11h à 17h, et le dimande de 10h à 18h.Visites guidées sur demande.",telephone: "05 61 77 84 25",accesMetro: "Saint-Cyprien-République, Esquirol (A)",accesBus: "2, 10, 12, 14, 78, 80")
        Musee musee6=new Musee(nom: "MUSEE DES AUGUSTINS - MUSEE DES BEAUX ARTS DE TOULOUSE",horairesOuverture: "Tous les jours : 10h - 18h /  nocturne le mercredi jusqu'à 21h.",telephone: "05 61 22 21 82",accesMetro:"Esquirol (A) ou Carmes (B)",accesBus: "ncv, 2, 10, 14, 38, 78, 80")
        Musee musee7=new Musee(nom: "MUSEE DES COMPAGNONS",horairesOuverture: "Le Mercredi et le 1er dimanche de chaque mois de 14h à 17h",telephone: "05 62 47 41 77",accesMetro: "Esquirol, Capitole (A)",accesBus: "2, 10, 12, 14, 38, 78, 80")
        Musee musee8=new Musee(nom: "MUSEE DES INSTRUMENTS DE MEDECINE DES HOPITAUX DE TOULOUSE",horairesOuverture: "Ouvert tous les jeudi et vendredi de 13h à 17h. Ouvert le premier dimanche du mois.Visites guidées sur demande.",telephone: "05 61 77 82 72",accesMetro: "Saint-Cyprien-République, Esquirol (A)",accesBus: "2, 10, 12, 14, 78, 80")
        Musee musee9=new Musee(nom: "MUSEE DU VIEUX TOULOUSE",horairesOuverture: "Ouvert tous les jours du 2 mai au 31 octobre de 14h00 à 18h00.Fermé le dimanche et jours fériés.",telephone: "05 62 27 11 50",accesMetro: "Esquirol, Capitole (A)",accesBus: "2, 10, 12, 14, 38, 78, 80")
        Musee musee10=new Musee(nom: "MUSEE GEORGES-LABIT",horairesOuverture:"Musée ouvert de 10h à 17h en hiver et de 10h à 18h en été (du 1er juin au 30 septembre). Fermeture hebdomadaire le mardi.Bibliothèque ouverte le lundi de 14h à 17h, le mardi et le mercredi : 9h-12h et 14h-17h.",telephone: "05 61 14 65 50",accesMetro: "François Verdier (B)",accesBus: "10, 2, 27")
        Musee musee11=new Musee(nom: "MUSEE PAUL-DUPUY - ARTS GRAPHIQUES ET ARTS DECORATIFS",horairesOuverture: "Ouvert de 10h - 17h en hiver et de 10h à 18h en été (du 1er juin au 30 septembre). Fermé le mardi et jours fériés.",telephone: "05 61 14 65 50",accesMetro: "Esquirol (A) Carmes (B)",accesBus: "ncv, 2, 12, 52")

        musee0.adresse=adresse0
        musee0.gestionnaire=mairie
        musee0.save(flush: true)

        musee1.adresse=adresse1
        musee1.gestionnaire=association
        musee1.save(flush: true)

        musee2.adresse=adresse2
        musee2.gestionnaire=mairie
        musee2.save(flush: true)

        musee3.adresse=adresse3
        musee3.gestionnaire=institution
        musee3.save(flush: true)

        musee4.adresse=adresse4
        musee4.gestionnaire=structure
        musee4.save(flush: true)

        musee5.adresse=adresse5
        musee5.gestionnaire=association
        musee5.save(flush: true)

        musee6.adresse=adresse6
        musee6.gestionnaire=mairie
        musee6.save(flush: true)

        musee7.adresse=adresse7
        musee7.gestionnaire=association
        musee7.save(flush: true)

        musee8.adresse=adresse5
        musee8.gestionnaire=structure
        musee8.save(flush: true)

        musee9.adresse=adresse8
        musee9.gestionnaire=association
        musee9.save(flush: true)

        musee10.adresse=adresse9
        musee10.gestionnaire=mairie
        musee10.save(flush: true)

        musee11.adresse=adresse10
        musee11.gestionnaire=mairie
        musee11.save(flush: true)
    }
}
