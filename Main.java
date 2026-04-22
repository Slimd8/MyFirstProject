import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        File file = new File("grades.txt");

        try {
            Scanner in = new Scanner(file);

            System.out.println("Student Grades: ");

            while (in.hasNextLine()){

                String line = in.nextLine();
                System.out.println(line);
            }
            in.close();
        }

        catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
    }
}