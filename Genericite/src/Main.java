//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Bibliotheque<String> bibliotheque = new Bibliotheque();
        bibliotheque.Add("za");
        bibliotheque.search("za");
        bibliotheque.Remove("za");
        bibliotheque.Size();
        bibliotheque.Affihe();
    }
}