public class Main {
    public static void main(String[] args) {
        
        System.out.println("Running test cases...");
        TextAnalyzerDriver.testOne();

        System.out.println("*************************************");

        // create a TextAnalyzer object here 
        TextAnalyzer text = new TextAnalyzer("CatInTheHatSmall.txt");
        text.reportStatistics();
        
        
        // call method reportStatistics, once you have written it
        
        

        System.out.println("*************************************");

    }
}
