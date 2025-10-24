import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class FileHandling {

        public static ArrayList<Student> loadFromFile () {
            try {
        Path filePath = Paths.get(System.getProperty("user.dir"), "Students.txt");
        BufferedReader r = new BufferedReader(new FileReader(filePath.toFile()));
        ArrayList<Student> students = new ArrayList<>();
        String line;
        Student e;
        while ((line = r.readLine()) != null) {
            e = createRecordFrom(line);
            Student.add(e);
        }

    }catch (IOException e){
                System.out.println("this file cannot be opened!");
                return;
            }
    }

}
