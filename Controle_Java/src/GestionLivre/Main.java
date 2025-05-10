package GestionLivre;

public class Main {
    public static void main(String[] args) {
        Utilisateur Util = new Utilisateur();
        Livre livre = new Livre();
        Util.ajouterLivre(livre);
        Util.afficherLivre();
        GestionBiblio G = new GestionBiblio();
        G.ajouterLivre(livre);




    }
}
