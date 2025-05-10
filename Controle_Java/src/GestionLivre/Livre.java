package GestionLivre;

public class Livre {
    private String titre;
    private String auteur;
    private boolean estDispo;
    public Livre() {

    }
    public Livre(String titre, String auteur) {
        this.titre = titre;
        this.auteur = auteur;
    }
    public String getTitre() {
        return titre;
    }

    public String getAuteur() {
        return auteur;
    }
    public boolean estDispo() {
        return estDispo;
    }


    @Override
    public String toString() {
        return "Livre{" +
                "titre='" + titre + '\'' +
                ", auteur='" + auteur + '\'' +
                ", estDispo=" + estDispo +
                '}';
    }
    public boolean Emprunter(){
        return estDispo = false;
    }

    public boolean Retourner(){
        return estDispo =true;
}

}
