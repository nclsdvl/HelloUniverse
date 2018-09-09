package com.nico;

import java.util.Scanner;

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

        VaisseauDeGuerre chasseur = new VaisseauDeGuerre("CHASSEUR");
        VaisseauDeGuerre fregate = new VaisseauDeGuerre("FREGATE");
        VaisseauDeGuerre croiseur = new VaisseauDeGuerre("CROISEUR");
        VaisseauCivil cargo = new VaisseauCivil("CARGO");
        VaisseauCivil vaisseauMonde = new VaisseauCivil("VAISSEAU-MONDE");


        Scanner sc = new Scanner(System.in);
        System.out.println("Quelle vaisseau souhaitez vous utiliser?");
        String vaisseau = sc.nextLine();


        System.out.println("Sur quelle planete souhaitez vous vous rendre?");
        Scanner sc1 = new Scanner(System.in);
        String planete = sc.nextLine();

        System.out.println("Quel tonnage souhaitez vous emporter?");
        Scanner sc2 = new Scanner(System.in);
        int tonnage = sc.nextInt();

    }
}
