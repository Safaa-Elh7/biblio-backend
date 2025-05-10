import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Ex5 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>(List.of("aaaaaA", "bbbbB", "cccccC", "dddD", "eeeeE", "fffffF"));
        list.stream().sorted(new Comparator<String>() {
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }

        }).forEach(System.out::println);

    }
}
