package com.nico;

import java.util.Scanner;

public class Main {

    public static void main(String... args) {

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

        Vaisseau chasseur = new VaisseauDeGuerre("CHASSEUR");
        chasseur.nbPassagers = 3;
        chasseur.blindage = 156;
        chasseur.resistanceDuBouclier = 2;

        Vaisseau croiseur = new VaisseauDeGuerre("CROISEUR");
        croiseur.nbPassagers = 35;
        croiseur.blindage = 851;
        croiseur.resistanceDuBouclier = 25;

        Vaisseau fregate = new VaisseauDeGuerre("FREGATE");
        fregate.nbPassagers = 100;
        fregate.blindage = 542;
        fregate.resistanceDuBouclier = 50;

        Vaisseau cargo = new VaisseauCivil("CARGO");
        cargo.nbPassagers = 10000;
        cargo.blindage = 1520;
        cargo.resistanceDuBouclier = 20;

        Vaisseau vaisseauMonde = new VaisseauCivil("VAISSEAU-MONDE");
        vaisseauMonde.nbPassagers = 10000;
        vaisseauMonde.blindage = 4784;
        vaisseauMonde.resistanceDuBouclier = 30;

        Scanner sc = new Scanner(System.in);
        System.out.println("Quel vaisseau souhaitez vous manipuler​ : CHASSEUR, FREGATE, CROISEUR, CARGO ou VAISSEAU-MONDE ?");
        String typeVaisseau = sc.nextLine();
        Vaisseau vaisseauSelectionne = null;
        switch (typeVaisseau) {
            case "CHASSEUR":
                vaisseauSelectionne = chasseur;
                break;
            case "FREGATE":
                vaisseauSelectionne = fregate;
                break;
            case "CROISEUR":
                vaisseauSelectionne = croiseur;
                break;
            case "CARGO":
                vaisseauSelectionne = cargo;
                break;
            case "VAISSEAU-MONDE":
                vaisseauSelectionne = vaisseauMonde;
                break;
        }

        System.out.println("Sur quelle planète tellurique du systeme solaire voulez-vous vous poser : Mercure, Venus, Terre ou Mars ?");
        String nomPlanete = sc.nextLine();
        PlaneteTellurique planeteSelectionnee = null;
        switch (nomPlanete) {
            case "Mercure":
                planeteSelectionnee = mercure;
                break;
            case "Venus":
                planeteSelectionnee = venus;
                break;
            case "Terre":
                planeteSelectionnee = terre;
                break;
            case "Mars":
                planeteSelectionnee = mars;
                break;

        }

        System.out.println("Quel tonnage souhaitez-vous emporter ?");
        int tonnageSouhaite = sc.nextInt();

        planeteSelectionnee.accueillirVaisseau(vaisseauSelectionne);
        System.out.println("Le vaisseau a rejeté : " + vaisseauSelectionne.emporterCargaison(tonnageSouhaite) + " tonnes.");

    }

}
