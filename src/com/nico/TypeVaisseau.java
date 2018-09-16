package com.nico;

public enum TypeVaisseau {

    CHASSEUR("chasseur"),
    FREGATE("fregate"),
    CROISEUR("croiseur"),
    CARGO("cargo"),
    VAISSEAUMONDE("vaisseau-monde");

    String nom;

    TypeVaisseau(String nom){
        this.nom= nom;
    }
}
