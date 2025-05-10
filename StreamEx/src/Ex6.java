import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Ex6 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>(List.of("aaaaaA", "bbbbB", "cccccC", "cccccC", "dddD", "eeeeE","eeeeE", "fffffF","fffffF"));
        Set<String> set = list.stream().collect(Collectors.toSet());
        for (String s : set) {
            System.out.println(s);
        }
    }
}
