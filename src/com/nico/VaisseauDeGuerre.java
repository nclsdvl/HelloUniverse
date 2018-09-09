package com.nico;

public class VaisseauDeGuerre extends Vaisseau {

    public void attaque (Vaisseau vaisseauAttaque, String arme, int duree) {

            System.out.println("Un vaisseau de type " + type + " attaque un vaisseau de type " + vaisseauAttaque.type + " en utilisant l'arme " + arme + " pendant " + duree + " minutes");
            vaisseauAttaque.blindage /= 2;
            vaisseauAttaque.resistanceDuBouclier = 0;

    }
}
