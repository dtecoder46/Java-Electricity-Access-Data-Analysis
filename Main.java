import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    /*
    Purpose: to call the other functions and label the analysis sections
    Parameters, Return: none
    */
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> CSVNestedList = CSVtoNestedList();
    }

    /*
    Purpose: to read in the CSV dataset and transform it into a list of lists
    */
    static ArrayList<ArrayList<String>> CSVtoNestedList() {
        File csv = new File("school_electricity_access.csv"); // file object
        String csv_string = ""; // string for storing file contents
        ArrayList<String> ListofLines = new ArrayList<String>(); // holds each CSV line to prepare for the conversion into a list of lists
        ArrayList<ArrayList<String>> ListofLists = new ArrayList<ArrayList<String>>(); // the variable which will hold the list of lists

        try (Scanner myReader = new Scanner(csv)) { // tries to read the file
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                ListofLines.add(data); // add each CSV line as a separate element of an ArrayList
            }
        } catch (FileNotFoundException e) { // error handling
            System.out.println("Error");
            e.printStackTrace();
        }

        System.out.println(csv_string);

        for (String line : ListofLines) {
            ArrayList<String> LineList = new ArrayList<String>();
            LineList.add(line); // converts the line string into a separate list
            ListofLists.add(LineList); // adds the line list into the list of lists
        }

        return ListofLists;
    }
}