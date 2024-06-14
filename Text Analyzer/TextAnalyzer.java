import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;
import java.io.FileNotFoundException;

/**
 * This class performs an analysis of the words in a text file.
 * 
 * @author Julien
 * @version 4/22/24
 */
public class TextAnalyzer {
    Scanner scan;
    private String filename;
    private int totalWords;
    private ArrayList<String> uniqueWords;

/**
 * 
 * @param filename
 */
    public TextAnalyzer(String filename) {
        try {
            File dataFile = new File(filename);
            scan = new Scanner(dataFile);
        } catch (FileNotFoundException exceptError) {
            System.out.println("Error opening input file " + filename);
            System.exit(0);
        }
        totalWords = 0;
        uniqueWords = new ArrayList<String>();
        this.filename = filename;
        readWords();
    }

    /**
     * Returns true if ch is a letter of the alphabet a-z or
     * A-Z, and false otherwise.
     * 
     * @param ch character to test
     * @return true if ch is a letter a-z or A-Z
     */
    public static boolean isLetter(char ch) {
        boolean result = false;
        if ((ch >= 65) && (ch <= 90) || (ch >= 97) && (ch <= 122)) {
            result = true;
        } else {
            return result;
        }
        return result;
    }

    /**
     * Returns a String consisting of only the letters a-z and
     * A-Z in token, in the same order. For example, if token
     * is "*aBc123-Def!" then this method will return "aBcDef".
     * If token contains no letters, then an empty string is
     * returned.
     * 
     * @param token a string of any characters
     * @return a String containing only the letters of token
     */
    public static String removeAllButLetters(String token) {
        String result = "";
        for (int i = 0; i < token.length(); i++) {
            if (isLetter(token.charAt(i))) {
                result += token.charAt(i);
            }
        }
        return result;
    }
    /**
     * 
     * scans file for total amount of unique words and total wars.
     */
    public void readWords() {
        while (scan.hasNext()) {
            String word = scan.next();
            String letters = removeAllButLetters(word);
            totalWords++;
            if (!uniqueWords.contains(letters)) {
                uniqueWords.add(letters);
            }
        }
    }
/**
 * 
 * @param ArraryList UniqueWords of strings
 * @return STring of longest characters in ArrayList
 */

    public String longest(ArrayList<String> uniqueWords) {
        String longest = uniqueWords.get(0);
        for (int i = 1; i < uniqueWords.size(); i++) {
            if (uniqueWords.get(i).length() > longest.length())
                longest = uniqueWords.get(i);
        }
        return longest;
    }
    /*
     * 
     * @param ArraryList UniqueWords of strings
     * @return String of the most used word used throughout the file
     */
    public String occurence(ArrayList<String> uniqueWords) {
        int maxCount = 0;
        String occur = "";
        for (int i = 0; i < uniqueWords.size(); i++) {
            String current = uniqueWords.get(i);
            int currentCount = 0;

            for (int j = 0; j < uniqueWords.size(); j++) {
                if (uniqueWords.get(i).equals(current)) {
                    currentCount++;
                }

                if (currentCount > maxCount) {
                    maxCount = currentCount;
                    occur = current;
                }
            }
        }
        return occur;
    }
/*
 * reports statistics and prints them
 */
    public void reportStatistics() {
        double amtOfUnique = uniqueWords.size();
        int amt = (int) (amtOfUnique);
        double percUnique = (amtOfUnique) / (totalWords) * 100;

        System.out.println("Word Analysis");
        System.out.println("Input file: " + filename);
        System.out.println("Total words: " + totalWords);
        System.out.println("Total unique words: " + amt);
        System.out.println("Percentage of unique words: " + (int) (percUnique) + "%");
        System.out.println("Longest word: " + longest(uniqueWords));
        System.out.println("Most frequently occuring word: " + occurence(uniqueWords));
    }
}
