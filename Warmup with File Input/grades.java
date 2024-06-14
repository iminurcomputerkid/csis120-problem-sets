/**
 * This class is used to read in quiz data from a file and 
 * print out each student's quiz average.  
 *
 * @author Julien
 * @version 4/2/24
 */

// You need the following 3 import statements to read from an 
// input file.
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Grades {
  // This instance variable is used to read quiz data from a file.
  Scanner scan;  

  /**
   * Constructor for class.  It initializes the instance variable
   * scan so that it is ready to read data from the file with
   * with the name filename.
   * 
   * @param filename name of file that the grade data will be read from
   */
  public Grades( String filename ) 
  {   
      // When opening a data file for reading from, you must put the  
      // code in a try-catch block, as done below.  The code in the try
      // block excutes first.  The catch block only executes if
      // if errors are encountered in opening the file.  
      try 
      {
         // Code in this try block executes first.

         // Create a File object for the file with the given name
         File dataFile = new File(filename);

         //Initialize instance variable scan so that it can read 
         // from the input file
         scan = new Scanner(dataFile);
	  } 
      catch (FileNotFoundException exceptError) 
      {
         // Code in this catch block only executes if an error is 
         // encountered when executing the code in the try block.

         System.out.println("Error opening input file " + filename);
         
         // This next line terminates the program
         System.exit(0);
      }
  }

  /**
   * Reads grade data for each student from a file using the Scanner
   * variable scan.  It prints out each student's first and last
   * name and their average quiz grade.  
   *
   */
  public void printQuizAvgs() 
  {
      // The Scanner hasNext() method returns true if there  
      // is still more data that can be read from the input file. 
      while ( scan.hasNext() )
      {
         // read in the next word from the input file

         String firstName = scan.next();
         String lastName = scan.next();
          System.out.print( firstName);
          System.out.print(" " + lastName);
          int avg;
          int grades;
          int sum = 0;
          for(int i = 0; i < 10; i++)
          {
           grades = scan.nextInt();
           sum = sum + grades;
          }
           avg = sum/10;
          System.out.print(" " + avg);
          System.out.println();
         
         // read in the rest of the line, up to and including the return character
         scan.nextLine();
      }
  }

}
