package LocationVoiure;

public class Voiture extends Vehicule {
    public int nbrPorte;
    public Voiture(String marque, String modele, double prixDeJour,int nbrPorte) {
        super(marque, modele, prixDeJour);
        this.nbrPorte = nbrPorte;
    }
    @Override
    public void affiche() {
        System.out.println(getMarque()+getModele()+getPrixDeJour()+nbrPorte);
    }

}
