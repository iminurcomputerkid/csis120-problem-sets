/**
 * This class is used to read in birthdays from a file and
 * print out a count of the number of birthdays in each month.
 *
 * @author Julien
 * @version 4/2/24
 */


import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Birthdays {
    // This instance variable is used to read birthdays from a file.
    private Scanner scan;

    // This instance variable is used to keep a count of the number of birthdays in
    // each month.
    private int[] monthFreq;


    /**
   * Constructor for class.  It initializes the instance variable
   * scan so that it is ready to read data from the file with
   * with the name filename.  It also initializes the instance
   * variable monthFreq so that it is an array of size 13, with each
   * value initialized to 0.
   *
   * @param filename name of file that the birthdays will be read from
   */
    public Birthdays(String filename) {
        try {
            File dataFile = new File(filename);
            scan = new Scanner(dataFile);
        } catch (FileNotFoundException exceptError) {
            System.out.println("Error opening input file " + filename);
            System.exit(0);
        }
        // When opening a data file for reading from, you must put the code in a
        // try-catch block. The code in the try block excutes first.  The catch block
        // only executes if if errors are encountered in opening the file.
        monthFreq = new int[13];
    }

    /**
   * Reads the birthdays in from the file using the Scanner
   * variable scan.  It keeps a tally of the number of birthdays
   * in each month using the instance variable monthFreq[].
   */
    public void countMonthFrequencies() {
        while (scan.hasNext()) {
            int year;
            year = scan.nextInt();
            int month;
            month = scan.nextInt();
            int day;
            day = scan.nextInt();
            monthFreq[month]++;

            scan.nextLine();
        }
    }


    /**
   * Prints out the number of birthdays in each month.
   */
    public void printMonthFrequencies() {
        System.out.println("Month #    Count of Birthdays");
        for (int i = 1; i < monthFreq.length; i++) {
            System.out.println(i + "            " + monthFreq[i]);
        }
    }
}
