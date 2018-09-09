package com.nico;

public class Vaisseau {

    String type;
    int nbPassagers;
    int blindage;
    int resistanceDuBouclier;

    public void activerBouclier(){
        System.out.println("Activation du bouclier d'un vaisseau de type "+type);
    }

    public void desactiverBouclier(){
        System.out.println("Désctivation du bouclier d'un vaisseau de type "+type);
    }
}
