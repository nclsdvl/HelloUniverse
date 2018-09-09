package com.nico;

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

        VaisseauDeGuerre chasseur=new VaisseauDeGuerre("CHASSEUR");
        chasseur.blindage=156;
        chasseur.resistanceDuBouclier=2;

        VaisseauCivil vaisseauMonde=new VaisseauCivil("VAISSEAU-MONDE");
        vaisseauMonde.blindage=4784;
        vaisseauMonde.resistanceDuBouclier=30;

        vaisseauMonde.activerBouclier();
        //chasseur.activerBouclier();
        chasseur.attaque(vaisseauMonde, "laser photonique", 3);
        //vaisseauMonde.desactiverBouclier();

        System.out.println("Le Vaisseau-Monde dispose encore de "+vaisseauMonde.resistanceDuBouclier+" minutes de protection grâce à son bouclier.");
        System.out.println("Le Vaisseau-Monde dispose encore d'un blindage de valeur "+vaisseauMonde.blindage+".");

        mars.accueillirVaisseau(vaisseauMonde);
        mars.accueillirVaisseau(chasseur);

        Vaisseau chasseurSurTerre = new VaisseauDeGuerre("CHASSEUR");
        terre.accueillirVaisseau(chasseurSurTerre);
        System.out.println("Le chasseur à rejeté : "+ chasseurSurTerre.emporterCargaison(20)+" tonnes!");

        Vaisseau fregate = new VaisseauDeGuerre("FREGATE");
        fregate.nbPassagers=100;
        terre.accueillirVaisseau(fregate);
        System.out.println("La fregate à rejeté "+fregate.emporterCargaison(45)+" tonnes");
        System.out.println("La fregate à rejeté "+fregate.emporterCargaison(12)+" tonnes");

        Vaisseau fregate2 = new VaisseauDeGuerre("FREGATE");
        fregate2.nbPassagers=14;
        terre.accueillirVaisseau(fregate2);
        System.out.println("La deuxieme fregate à rejeter "+fregate2.emporterCargaison(30)+" tonnes");

        terre.accueillirVaisseau(vaisseauMonde);
        System.out.println("Le Vaisseau-Monde à rejeté "+ vaisseauMonde.emporterCargaison(1560)+" tonnes");
        System.out.println("Le vaisseau-Monde à rejeté "+vaisseauMonde.emporterCargaison(600)+" tonnes");
    }
}
