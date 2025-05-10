import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ex2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>(List.of(1,2,3,4));
        List<Integer> list1 = list.stream().map(n->n*n).toList();
        for(Integer i : list1)
            System.out.println(i);
    }
}
