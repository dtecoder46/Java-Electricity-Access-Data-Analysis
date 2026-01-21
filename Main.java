import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    /*
    Purpose: to call the other functions and label the analysis sections
    Parameters, Return: none
    */
    public static void main(String[] args) {
        CSVtoNestedList();
    }

    /*
    Purpose: to read in the CSV dataset and transform it into a list of lists
    */
    static void CSVtoNestedList() {
        File csv = new File("school_electricity_access.csv");

        try (Scanner myReader = new Scanner(csv)) {
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }
}