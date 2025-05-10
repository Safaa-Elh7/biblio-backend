import java.util.ArrayList;
import java.util.List;

public class Ex4 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>(List.of("aaaaaA", "bbbbB", "cccccC", "dddD", "eeeeE", "fffffF"));
        List<String> Upper = new ArrayList<>();
        list.stream().forEach(m->Upper.add(m.toUpperCase()));
        for (String str : Upper) {
            System.out.println(str);
        }
    }
}
