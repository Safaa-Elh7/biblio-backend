package GestionLivre;

import java.util.HashMap;
import java.util.Map;

public class GestionBiblio extends Utilisateur {
    public class GestionBibliotheque {
        Map<Utilisateur, Livre> livres;

        public GestionBibliotheque() {
            livres = new HashMap<Utilisateur, Livre>();
        }

        public void AjouterLivre(Utilisateur utilisateur, Livre livre) {
            livres.put(utilisateur, livre);
        }


    }
}
