package GestionLivre;

public class LivreEmprunteException extends RuntimeException {
    public LivreEmprunteException() {
        super("plus que 5");
    }
}
