import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        File f = new File("exemple.txt");
//        File d = new File("monDossier");
//        if (file.exists()){
//            System.out.println("File exists");
//        }else {
//            System.out.println("File does not exist");
//        }
        File directory = new File("myFolder");
        if (directory.mkdir()){
            System.out.println("Directory created");
        }else {
            System.out.println("Directory does not exist");
        }
        File file = new File("myFolder/exemple.txt");
        File file1 = new File("myFolder/exemple1.txt");
        File file2 = new File("myFolder/exemple2.txt");
        File file3 = new File("myFolder/exemple3.txt");
        File file4 = new File("myFolder/exemple4.txt");

        try {
            if ( file1.createNewFile() && file2.createNewFile() && file3.createNewFile() && file4.createNewFile()){
                System.out.println("File Created");
            }else {
                System.out.println("File already exists");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        File renamedFile = new File("myFolder/renamed_example.txt");
        if (file2.renameTo(renamedFile)){
            System.out.println("File Renamed");
        }else {
            System.out.println("File Not Renamed");
        }
        if (directory.isDirectory()){
            String[] files = directory.list();
            for (String fileName : files) {
                System.out.println(fileName);
            }
        }
        Path absolutePath = Paths.get("C:\\Users\\safaa\\IdeaProjects\\File\\myFolder\\exemple.txt");
        String content = "Bomjour,ceci est un exemple d'ecriture dans un fichier";
        String content1 = "Bonjour,ceci est un exemple avec BufferdWriter";
//        try(BufferedWriter writer = new BufferedWriter(new FileWriter("myFolder/exemple.txt"))) {
//        try(PrintWriter writer = new PrintWriter("myFolder/exemple1.txt")) {
//        try(FileOutputStream fos = new FileOutputStream("myFolder/exemple1.txt")) {
        try(FileInputStream fis = new FileInputStream("myFolder/exemple1.txt")) {
            int data;
            while ((data = fis.read()) != -1) {
                System.out.print((char) data);
            }
//            fos.write(content.getBytes());
//            System.out.println("contenu ecrut dans le fichier");
//            Files.write(absolutePath, content.getBytes(StandardCharsets.UTF_8));
//            Files.write(absolutePath," hiiiiiiiiiiiiiiiiiiiiiii ".getBytes(), StandardOpenOption.APPEND);
//            List<String> lines = Files.readAllLines(absolutePath);
//            lines.forEach(System.out::println);
//            writer.write(content1);
//            writer.println("ligne1:example avec PrintWrier");
//            writer.println("ligne2:example avec PrintWriter");
//            System.out.println("File Created");
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}