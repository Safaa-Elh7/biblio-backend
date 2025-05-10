package LocationVoiure;

public class Moto extends Vehicule{
    public int cylindree;
    public Moto(String marque, String modele, double prixDeJour, int cylindree) {
        super(marque, modele, prixDeJour);
        this.cylindree = cylindree;
    }
    @Override
    public void affiche() {
        System.out.println(getMarque()+getModele()+getPrixDeJour()+cylindree);
    }
}
