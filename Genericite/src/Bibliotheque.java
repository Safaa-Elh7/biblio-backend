import java.util.ArrayList;
import java.util.List;

public class Bibliotheque<T> {
    ArrayList<T> E = new ArrayList<>();
    public void Add(T item) throws DepasseException{

        if(E.size()<11){
            E.add(item);

        }else throw new DepasseException("depasse 10");
    }
    public void search(T item){
        if (E.contains(item)) {
            System.out.println("exist");
        }
    }
    public void Remove(T item){
        if (E.contains(item)) {
            E.remove(item);
            System.out.println("remove B");
        }

    }
    public void Size(){
        E.size();
    }
    public void Affihe(){
        for (T e: E) {
            System.out.println(e);
        }
    }





}
