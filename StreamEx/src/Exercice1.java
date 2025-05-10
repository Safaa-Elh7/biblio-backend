import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Exercice1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>(List.of("Aaaa", "Baaa", "dddC", "BgggD", "AAaaE", "BhhhF", "G", "H"));
        Stream<String> stream = list.stream();
        stream.filter(s->{
            return s.startsWith("A")||s.startsWith("B");
        }).forEach(System.out::println);
    }
}
