package LocationVoiure;

public abstract class Vehicule {
    private String marque;
    private String modele;
    private double prixDeJour;
    public Vehicule(String marque, String modele, double prixDeJour) {
        this.marque = marque;
        this.modele = modele;
        this.prixDeJour = prixDeJour;
    }
    public String getMarque() {
        return marque;
    }
    public void setMarque(String marque) {
        this.marque = marque;
    }
    public String getModele() {
        return modele;
    }
    public void setModele(String modele) {
        this.modele = modele;
    }
    public double getPrixDeJour() {
        return prixDeJour;
    }
    public void setPrixDeJour(double prixDeJour) {
        this.prixDeJour = prixDeJour;
    }
    public abstract void affiche();
    public double Prix(int duree){
        return prixDeJour*duree;
    }
}
