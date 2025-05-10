package Bibliotheque;

import java.util.HashMap;

class GestionEtudiantsHashMap {
    private HashMap<String, Etudiant> etudiants;

    public GestionEtudiantsHashMap() {
        this.etudiants = new HashMap<>();
    }

    public void ajouterEtudiant(Etudiant e) {
        etudiants.put(e.getId(), e);
        System.out.println("Étudiant ajouté : " + e);
    }

    public void afficherEtudiants() {
        System.out.println("\nListe des étudiants (HashMap) :");
        etudiants.values().forEach(System.out::println);
    }

    public void rechercherParNom(String nom) {
        System.out.println("\nÉtudiants trouvés avec le nom '" + nom + "' (HashMap) :");
        etudiants.values().stream()
                .filter(e -> e.getNom().equalsIgnoreCase(nom))
                .forEach(System.out::println);
    }

    public void trierParMoyenne() {
        System.out.println("\nÉtudiants triés par moyenne croissante (HashMap) :");
        etudiants.values().stream()
                .sorted((e1, e2) -> Double.compare(e1.getMoyenne(), e2.getMoyenne()))
                .forEach(System.out::println);
    }
}