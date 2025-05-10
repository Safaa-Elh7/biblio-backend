package Biblio;

public class LivreRoman extends Livre{
    public String genre;
    public LivreRoman(String title, String auteur, int anneePub, boolean disponible, String genre) {
        super(title, auteur, anneePub, disponible);
        this.genre = genre;
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println(genre);
    }
}
