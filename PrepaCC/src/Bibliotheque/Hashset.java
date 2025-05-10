package Bibliotheque;

import java.util.HashSet;

class GestionEtudiantsHashSet {
    private HashSet<Etudiant> etudiants;

    public GestionEtudiantsHashSet() {
        this.etudiants = new HashSet<>();
    }

    public void ajouterEtudiant(Etudiant e) {
        if (etudiants.add(e)) {
            System.out.println("Étudiant ajouté : " + e);
        } else {
            System.out.println("Erreur : Étudiant déjà présent (HashSet).");
        }
    }

    public void afficherEtudiants() {
        System.out.println("\nListe des étudiants (HashSet) :");
        etudiants.forEach(System.out::println);
    }

    public void rechercherParNom(String nom) {
        System.out.println("\nÉtudiants trouvés avec le nom '" + nom + "' (HashSet) :");
        etudiants.stream()
                .filter(e -> e.getNom().equalsIgnoreCase(nom))
                .forEach(System.out::println);
    }

    public void trierParMoyenne() {
        System.out.println("\nImpossible de trier directement les étudiants (HashSet) :");
        etudiants.stream()
                .sorted((e1, e2) -> Double.compare(e1.getMoyenne(), e2.getMoyenne()))
                .forEach(System.out::println);
    }
}