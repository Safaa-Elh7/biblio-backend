package JeuDeCombat;

public class Personnage implements Comportement {
    public String nom;
    public int pointsVie ;
    public int Force ;

    public Personnage() {
        this.nom = "";
        this.pointsVie = 100 ;
        this.Force = 0 ;

    }
    public Personnage(String nom, int pointsVie, int Force) throws ForceInvalideException{

        if(Force < 10 || Force > 20){
            throw new ForceInvalideException("Force invalide");
        }
        this.nom = nom;
        this.pointsVie = pointsVie;
        this.Force = Force;

    }

    //getters
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public int getPointsVie() {
        return pointsVie;
    }
    public void setPointsVie(int pointsVie) {
        this.pointsVie = pointsVie;
    }
    public int getForce() {
        return Force;
    }
    public void setForce(int force) {
        Force = force;
    }

    @Override
    public void afficherEtat() {
        System.out.println("Nom: " + nom+ " Vie: " + pointsVie + " Force: " + Force);
    }

    //methode enVie()
    @Override
    public boolean enVie() {
        if(pointsVie > 0){
            return true;
        }else {
            return false;
        }
    }

    //methode attaquer()
    @Override
    public void attaquer(Personnage personnage) {


    }





    //methode enVie()


    //redefinitions des methodes


}
