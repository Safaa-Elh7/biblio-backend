package GestionLivre;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Utilisateur extends Livre  {
    public String nom;
    ArrayList<Livre> livres;
    public Utilisateur() {

    }
    public Utilisateur(String titre, String auteur,  String nom) {
        super(titre, auteur);
        this.nom = nom;
        livres = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }
    public ArrayList<Livre> getLivres() {
        return livres;
    }


    @Override
    public String toString() {
        return "Utilisateur{" +
                "nom='" + nom + '\'' ;
    }
    public void ajouterLivre(Livre livre) {
        System.out.println("entrer le nb des livres");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("entrer le nom");
        for (int i = 0; i < n; i++) {
            Scanner sc1 = new Scanner(System.in);
            String titre = sc1.next();
            String auteur = sc1.next();
            if (livre != null) {
                throw new LivreEmprunteException();
            }
            livres.add(new Livre(titre,auteur));
        }

    }


    public void emprunter(Livre livre) {
        if (livres.size() < 5) {
            livre.Emprunter();
            livres.add(livre);
        } else {
            throw new LivreEmprunteException();
        }

    }

    void retourLivre(Livre Livre) {
        Livre.Retourner();
        livres.remove(Livre);
    }


    public void afficherLivre() {
        for (Livre livre : livres) {
            System.out.println(livre);
        }
    }
}
