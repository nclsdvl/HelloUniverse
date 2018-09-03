package com.nico;

public class VaisseauDeGuerre extends Vaisseau {

    public void attaque (Vaisseau vaisseau, String arme, int duree){
        System.out.println("Un vaisseau de type "+ type +" attaque un vaisseau de type " + vaisseau.type + " en utilisant l'arme "+arme+" pendant " +duree+" minutes");
        vaisseau.blindage /= 2;
        vaisseau.resistanceDuBouclier =0;
    }
}
