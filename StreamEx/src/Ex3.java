import java.util.ArrayList;
import java.util.List;

public class Ex3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>(List.of(1,2,3,4));
        int sum = list.stream().reduce(0, Integer::sum);
        System.out.println(sum);
    }
}
