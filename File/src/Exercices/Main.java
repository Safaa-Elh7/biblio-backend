package Exercices;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Ex1
        File f = new File("Input.txt");
        try {
            if (f.createNewFile()){
                System.out.println("File Created");
            }else {
                System.out.println("File already exists");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        try {
            Path absolutePath = Paths.get("C:\\Users\\safaa\\IdeaProjects\\File\\src\\Exercices\\input.txt");
            String content = "Bonjour \n";
            Files.write(absolutePath,content.getBytes(), StandardOpenOption.APPEND);
            List<String> lines = Files.readAllLines(absolutePath);
            lines.forEach(System.out::println);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
