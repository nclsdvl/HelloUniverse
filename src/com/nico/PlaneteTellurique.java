package com.nico;

public class PlaneteTellurique extends Planete implements Habitable {

    public static int totalVisiteurs;
    public static Vaisseau vaisseauAccoste;


    public PlaneteTellurique(String nom) {
        super(nom);
    }

        public Vaisseau accueillirVaisseau(Vaisseau nouveauVaisseau){

        PlaneteTellurique.totalVisiteurs+=nouveauVaisseau.nbPassagers;

        Vaisseau vaisseauPrecedent=vaisseauAccoste;

        vaisseauAccoste=nouveauVaisseau;

        System.out.println("un vaisseau de type "+nouveauVaisseau.type+" vient d'accoster sur "+ nom);

        return vaisseauPrecedent;

    }

}
