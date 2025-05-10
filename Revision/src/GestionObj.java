import java.util.List;

public interface GestionObj<T> {
    public void add(T obj);
    List<T> search(String titreDoc);
    public void afficherTousObj();


}
