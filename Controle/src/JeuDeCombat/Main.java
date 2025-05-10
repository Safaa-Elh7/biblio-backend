package JeuDeCombat;

public class Main {
    public static void main(String[] args) {
        Personnage p1 = null;
        try {
            p1 = new Personnage("El jalili ", 101, 10);
        } catch (ForceInvalideException e) {
            System.out.println(e.getMessage());
        }

        Personnage p2 = null;
        try {
            p2 = new Personnage("Imane ", 102, 15);
        } catch (ForceInvalideException e) {
            System.out.println(e.getMessage());
        }

        Personnage p3 = null;
        try {
            p3 = new Personnage("dodo ", 103, 20);
        } catch (ForceInvalideException e) {
            System.out.println(e.getMessage());
        }
        //exception provoque avec force 22
        Personnage p4 = null;
        try {
            p4 = new Personnage("Eli ", 104, 22);
        } catch (ForceInvalideException e) {
            System.out.println(e.getMessage());
        }


        Combat combat = new Combat();
        System.out.println(" Ajout des personnes : ");
        combat.ajouterPersonnage(p1);
        combat.ajouterPersonnage(p2);
        combat.ajouterPersonnage(p3);
        combat.ajouterPersonnage(p4);

        System.out.println(" l etat des personnage : ");
        assert p1 != null;
        p1.afficherEtat();
        assert p2 != null;
        p2.afficherEtat();
        assert p3 != null;
        p3.afficherEtat();
        assert p4 != null;
        p4.afficherEtat();

        System.out.println(" les personnage en vie : ");
        p1.enVie();
        p2.enVie();
        p3.enVie();
        p4.enVie();


        combat.afficherPersonnages(p1);
        combat.afficherPersonnages(p2);
        combat.afficherPersonnages(p3);
        combat.afficherPersonnages(p4);






    }
}
