package com.nico;

public class PlaneteTellurique extends Planete implements Habitable{

    Vaisseau[][] vaisseauxAccostes;
    int totalVisiteurs;

    public PlaneteTellurique(String nom, int nbPlacesBaie) {
        super(nom);
        this.vaisseauxAccostes = new Vaisseau[nbPlacesBaie][nbPlacesBaie];
    }

    boolean restePlaceDisponible(Vaisseau vaisseau) {

        int indexZone = 0;

        switch (vaisseau.type){
            case CARGO :
            case VAISSEAUMONDE :
                indexZone=1;
        }

        for (int i = 0; i < vaisseauxAccostes[indexZone].length; i++) {
            if (vaisseauxAccostes[indexZone][i] == null) {
                return true;
            }
            
        }
        return false;
    }

    public void accueillirVaisseaux(Vaisseau... vaisseaux) {
        for (int i = 0; i < vaisseaux.length; i++) {
            int indexZone = 0;

            switch (vaisseaux[i].type){
                case CARGO :
                case VAISSEAUMONDE :
                    indexZone=1;
            }
            for (int index = 0; index < vaisseauxAccostes[indexZone].length; index++) {
                if (vaisseauxAccostes[indexZone][index] == null) {
                    vaisseauxAccostes[indexZone][index] = vaisseaux[i];
                    break;
                }
            }
            if (vaisseaux[i] instanceof VaisseauDeGuerre) {
                ((VaisseauDeGuerre) vaisseaux[i]).desactiverArmes();
            }

            totalVisiteurs += vaisseaux[i].nbPassagers;
        }

    }
}


