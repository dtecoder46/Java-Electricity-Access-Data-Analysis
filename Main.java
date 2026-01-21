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
        File csv = new File("school_electricity_access.csv"); // file object
        String csv_string = ""; // string for storing file contents

        try (Scanner myReader = new Scanner(csv)) { // tries to read the file
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                csv_string += data + "\n"; // add each line to the csv_string variable
            }
        } catch (FileNotFoundException e) { // error handling
            System.out.println("Error");
            e.printStackTrace();
        }

        System.out.println(csv_string);
    }
}