package JeuDeCombat;

public interface Comportement {
    public abstract void attaquer(Personnage personnage);
    public abstract void afficherEtat();
    public abstract boolean enVie();


}
