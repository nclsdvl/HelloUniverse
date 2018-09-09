package com.nico;

public class Main {

    public static void main(String[] args) {
        PlaneteTellurique mercure = new PlaneteTellurique("Mercure");
        mercure.diametre = 4880;

        PlaneteTellurique venus = new PlaneteTellurique("Venus");
        venus.diametre = 12100;

        PlaneteTellurique terre = new PlaneteTellurique("Terre");
        terre.diametre = 12756;

        PlaneteTellurique mars = new PlaneteTellurique("Mars");
        mars.diametre = 6792;

        PlaneteGazeuse jupiter = new PlaneteGazeuse("Jupiter");
        jupiter.diametre = 142984;

        PlaneteGazeuse saturne = new PlaneteGazeuse("Saturne");
        saturne.diametre = 120536;

        PlaneteGazeuse uranus = new PlaneteGazeuse("Uranus");
        uranus.diametre = 51118;

        PlaneteGazeuse neptune = new PlaneteGazeuse("Neptune");
        neptune.diametre = 49532;


        VaisseauDeGuerre chasseur = new VaisseauDeGuerre();
        chasseur.blindage=156;
        chasseur.resistanceDuBouclier=2;
        chasseur.type= "CHASSEUR";

        VaisseauCivil vaisseauMonde = new VaisseauCivil();
        vaisseauMonde.blindage=4784;
        vaisseauMonde.resistanceDuBouclier=30;
        vaisseauMonde.type = "VAISSEAU MONDE";

        chasseur.activerBouclier();
        vaisseauMonde.activerBouclier();

        chasseur.attaque(vaisseauMonde,"laser photonique",3);

        vaisseauMonde.desactiverBouclier();

        System.out.println("durée residuelle du bouclier du vaisseau-monde : "+vaisseauMonde.resistanceDuBouclier);
        System.out.println("le blindage du vaisseau-monde est maintenant de : "+vaisseauMonde.blindage);

        mars.accueillirVaisseau(vaisseauMonde);
        mars.accueillirVaisseau(chasseur);
    }
}
