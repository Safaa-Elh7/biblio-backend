package Biblio;

public class Magazine extends Livre{
    public int num;
    public String moisPub;
    public Magazine(String title, String auteur, int anneePub, boolean disponible,int num,String moisPub) {
        super(title, auteur, anneePub, disponible);
        this.num = num;
        this.moisPub = moisPub;
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println("Num Magazine: " + this.num);
        System.out.println("Mois Pub: " + this.moisPub);
    }
}
