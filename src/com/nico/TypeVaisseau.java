package com.nico;

public enum TypeVaisseau {

    CHASSEUR("Chasseur"), FREGATE("Frégate"), CROISEUR("Croiseur"), CARGO("Cargo"), VAISSEAUMONDE("vaisseauMonde");
    public String nom;

    TypeVaisseau(String nom) {
        this.nom = nom;
    }

}
