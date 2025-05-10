package JeuDeCombat;

import java.util.LinkedList;

public class Combat {
    public LinkedList<Personnage> personnages;
    public Combat() {
        personnages = new LinkedList<Personnage>();

    }

    //methode d ajout
    public void ajouterPersonnage(Personnage p) {
        if( p != null) {
            personnages.add(p);
        }
        else {  System.out.println("Erreur de ajouter un personnage"); }

    }

    //methode pour lancer le dual
    public void lancerLeDuel () {

        for (Personnage p : personnages) {

        }
    }

    //afficher les personnages ayant une force superieur a 15
    public void afficherPersonnages(Personnage personnage) {
        if(personnage.getForce() > 15) {
            System.out.println(personnage);
        }
    }


}
