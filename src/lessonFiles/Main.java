package lessonFiles;


import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        Path path = Paths.get("taskTreeSer.txt");
        File file = new File("G:\\Ira_student/", "Hello.txt");
        System.out.println("hello" + file.getName());

        System.out.println(path.getFileName());
        System.out.println(file.getParent());
        System.out.println(path.getRoot());
    }
}
