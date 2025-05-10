package Bibliotheque;

import java.util.ArrayList;
import java.util.stream.Collectors;

class GestionEtudiantsArrayList {
    private ArrayList<Etudiant> etudiants;

    public GestionEtudiantsArrayList() {
        this.etudiants = new ArrayList<>();
    }

    public void ajouterEtudiant(Etudiant e) {
        etudiants.add(e);
        System.out.println("Étudiant ajouté : " + e);
    }

    public void afficherEtudiants() {
        System.out.println("\nListe des étudiants (ArrayList) :");
        etudiants.forEach(System.out::println);
    }

    public void rechercherParNom(String nom) {
        System.out.println("\nÉtudiants trouvés avec le nom '" + nom + "' (ArrayList) :");
        etudiants.stream()
                .filter(e -> e.getNom().equalsIgnoreCase(nom))
                .forEach(System.out::println);
    }

    public void trierParMoyenne() {
        System.out.println("\nÉtudiants triés par moyenne croissante (ArrayList) :");
        etudiants.stream()
                .sorted((e1, e2) -> Double.compare(e1.getMoyenne(), e2.getMoyenne()))
                .forEach(System.out::println);
    }
}
