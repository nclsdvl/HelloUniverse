package com.nico;

public class PlaneteTellurique extends Planete implements Habitable{

    Vaisseau vaisseauAccoste;
    int nbTotalHumains;
    int tailleBaie;
    Vaisseau[] vaisseauxAccostes;


    public PlaneteTellurique(String nom, int tailleBaie) {
        super(nom);
        this.vaisseauxAccostes = new Vaisseau[tailleBaie];
    }

    public boolean restePlaceDisponible() {
        for (int i = 0; i < vaisseauxAccostes.length; i++) {
            if (vaisseauxAccostes[i] == null) {
                return true;
            }
        }
        return false;
    }

    public void accueillirVaisseaux(Vaisseau... vaisseau) {

        for (int i = 0; i < vaisseau.length; i++) {
            
            for (int j = 0; j < vaisseauxAccostes.length; j++) {
                if (vaisseauxAccostes[j] == null) {
                    vaisseauxAccostes[j] = vaisseau[i];
                    break;
                }
            }

            if (vaisseau[i] instanceof VaisseauDeGuerre) {
                ((VaisseauDeGuerre) vaisseau[i]).desactiverArmes();
            }

            nbTotalHumains += vaisseau[i].nbPassagers;

        }


    }
}

