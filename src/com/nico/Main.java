package com.nico;

import java.util.Scanner;

public class Main {

    public static void main(String... args) {

        PlaneteTellurique mercure = new PlaneteTellurique("Mercure",4);
        mercure.diametre = 4880;
        PlaneteTellurique venus = new PlaneteTellurique("Venus", 4);
        venus.diametre = 12100;
        PlaneteTellurique terre = new PlaneteTellurique("Terre", 4);
        terre.diametre = 12756;
        PlaneteTellurique mars = new PlaneteTellurique("Mars",1);
        mars.diametre = 6792;
        PlaneteGazeuse jupiter = new PlaneteGazeuse("Jupiter");
        jupiter.diametre = 142984;
        PlaneteGazeuse saturne = new PlaneteGazeuse("Saturne");
        saturne.diametre = 120536;
        PlaneteGazeuse uranus = new PlaneteGazeuse("Uranus");
        uranus.diametre = 51118;
        PlaneteGazeuse neptune = new PlaneteGazeuse("Neptune");
        neptune.diametre = 49532;



        Vaisseau chasseur = new VaisseauDeGuerre(TypeVaisseau.CHASSEUR);
        chasseur.nbPassagers = 3;
        chasseur.blindage = 156;
        chasseur.resistanceDuBouclier = 2;

        Vaisseau chasseur2 = new VaisseauDeGuerre(TypeVaisseau.CHASSEUR);
        chasseur2.nbPassagers = 3;
        chasseur2.blindage = 156;
        chasseur2.resistanceDuBouclier = 2;

        Vaisseau chasseur3 = new VaisseauDeGuerre(TypeVaisseau.CHASSEUR);
        chasseur3.nbPassagers = 3;
        chasseur3.blindage = 156;
        chasseur3.resistanceDuBouclier = 2;



        Vaisseau croiseur = new VaisseauDeGuerre(TypeVaisseau.CROISEUR);
        croiseur.nbPassagers = 35;
        croiseur.blindage = 851;
        croiseur.resistanceDuBouclier = 25;

        Vaisseau fregate = new VaisseauDeGuerre(TypeVaisseau.FREGATE);
        fregate.nbPassagers = 100;
        fregate.blindage = 542;
        fregate.resistanceDuBouclier = 50;

        Vaisseau cargo = new VaisseauCivil(TypeVaisseau.CARGO);
        cargo.nbPassagers = 10000;
        cargo.blindage = 1520;
        cargo.resistanceDuBouclier = 20;

        Vaisseau vaisseauMonde = new VaisseauCivil(TypeVaisseau.VAISSEAUMONDE);
        vaisseauMonde.nbPassagers = 10000;
        vaisseauMonde.blindage = 4784;
        vaisseauMonde.resistanceDuBouclier = 30;

        terre.accueillirVaisseaux(chasseur2, chasseur3, cargo);

        String recommencer;
        do {


            Scanner sc = new Scanner(System.in);
            System.out.println("Quel vaisseau souhaitez vous manipuler​ : CHASSEUR, FREGATE, CROISEUR, CARGO ou VAISSEAU-MONDE ?");
            String vaisseauSelectionne = sc.nextLine();

            TypeVaisseau typeVaisseau = TypeVaisseau.valueOf(vaisseauSelectionne);
            Vaisseau vaisseau = null;


            switch (typeVaisseau) {
                case CHASSEUR:
                    vaisseau = chasseur;
                    break;
                case FREGATE:
                    vaisseau = fregate;
                    break;
                case CROISEUR:
                    vaisseau = croiseur;
                    break;
                case CARGO:
                    vaisseau = cargo;
                    break;
                case VAISSEAUMONDE:
                    vaisseau = vaisseauMonde;
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
            sc.nextLine();


            if (!planeteSelectionnee.restePlaceDisponible()) {
                System.out.println("Il ne reste pas de place disponible sur : " + nomPlanete);
            } else {
                planeteSelectionnee.accueillirVaisseaux(vaisseau);
                System.out.println("Le vaisseau a rejeté : " + vaisseau.emporterCargaison(tonnageSouhaite) + " tonnes.");
            }


            System.out.println("Voulez vous recommencer ?");
            recommencer = sc.nextLine();

        }while (recommencer.equalsIgnoreCase("oui"));

    }

}
