package com.nico;

public class VaisseauCivil extends Vaisseau {

    public VaisseauCivil(String type) {
        this.type = type;
        if (type.equals("CARGO")){
            tonnageMax=500;
        }
        else if (type.equals("VAISSEAU-MONDE")){
            tonnageMax=2000;
        }
    }

    @Override
    int emporterCargaison(int cargaison) {
        int tonnageRestant=tonnageMax-tonnageActuel;
        if (cargaison > tonnageRestant){
            tonnageActuel = tonnageMax;
            return  cargaison-tonnageRestant;
        }
        else {
           tonnageActuel += cargaison;
           return 0;
        }

    }
}
