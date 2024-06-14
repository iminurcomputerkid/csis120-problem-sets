public class Main {

    public static void main(String[] args) {
        // Creates object of type Grades. The constructor
        // opens data file for reading.

        Grades g = new Grades("quizgrades.txt"); 

        Birthdays bds = new Birthdays("births.txt");
        bds.countMonthFrequencies();
        bds.printMonthFrequencies();
        
        // reads in data from file and prints quiz averages
         g.printQuizAvgs(); 
    }

}
