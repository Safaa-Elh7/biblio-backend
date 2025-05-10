package Biblio;

public class Livre {
    public String title;
    public String auteur;
    public int anneePub;
    public boolean disponible;
    public Livre(String title, String auteur, int anneePub, boolean disponible) {
        this.title = title;
        this.auteur = auteur;
        this.anneePub = anneePub;
        this.disponible = disponible;
    }
    public boolean emprunter(){
        if(disponible==true){
            return false;
        }
        return true;
    }
    public boolean retourner(){
        if(disponible==false){
            return true;
        }
        return false;
    }
    public void afficher(){
        System.out.println(title);
        System.out.println(auteur);
        System.out.println(anneePub);
    }

}

