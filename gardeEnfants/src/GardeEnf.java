import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

public class GardeEnf {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<String> s = new ArrayList<>(List.of("ali", "anass", "jannah", "youssef", "nada", "joud"));
//        s.forEach(
//                new Consumer<String>() {
//                    @Override
//                    public void accept(String e) {
//                        System.out.println("bonjour" + e + "tu es ne en quelle annee");
//                        int anneNaissance = sc.nextInt();
//                        int anneeAujourdhui = LocalDate.now().getYear();
//                        System.out.println("tu as maintenant" + (anneeAujourdhui - anneNaissance) + "ans");
//                    }
//                }
//                e->{
//                    System.out.println("bonjour" + e + "tu es ne en quelle annee");
//                        int anneNaissance = sc.nextInt();
//                        int anneeAujourdhui = LocalDate.now().getYear();
//                        System.out.println("tu as maintenant" + (anneeAujourdhui - anneNaissance) + "ans");
//                }
//                e->GardeEnf.AfficherNaissance(e)
//        );
        s.forEach(GardeEnf::AfficherNaissance);

    }
    private static void AfficherNaissance(String e){
        Scanner sc = new Scanner(System.in);
        System.out.println("bonjour" + e + "tu es ne en quelle annee");
        int anneNaissance = sc.nextInt();
         int anneeAujourdhui = LocalDate.now().getYear();
         System.out.println("tu as maintenant" + (anneeAujourdhui - anneNaissance) + "ans");
    }
}
