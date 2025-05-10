package Bibliotheque;

import java.util.Vector;

class GestionEtudiantsVector {
    private Vector<Etudiant> etudiants;

    public GestionEtudiantsVector() {
        this.etudiants = new Vector<>();
    }

    public void ajouterEtudiant(Etudiant e) {
        etudiants.add(e);
        System.out.println("Étudiant ajouté : " + e);
    }

    public void afficherEtudiants() {
        System.out.println("\nListe des étudiants (Vector) :");
        etudiants.forEach(System.out::println);
    }

    public void rechercherParNom(String nom) {
        System.out.println("\nÉtudiants trouvés avec le nom '" + nom + "' (Vector) :");
        etudiants.stream()
                .filter(e -> e.getNom().equalsIgnoreCase(nom))
                .forEach(System.out::println);
    }

    public void trierParMoyenne() {
        System.out.println("\nÉtudiants triés par moyenne croissante (Vector) :");
        etudiants.stream()
                .sorted((e1, e2) -> Double.compare(e1.getMoyenne(), e2.getMoyenne()))
                .forEach(System.out::println);
    }
}