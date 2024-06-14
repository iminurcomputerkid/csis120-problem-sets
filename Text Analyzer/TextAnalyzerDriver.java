/**
 * This is a test driver for evaluating methods in TextAnalyzer.
 * 
 * @author Prof Flatland
 * @version Spring 2024
 */
public class TextAnalyzerDriver {
    /**
     * Tests methods isLetter and removeAllButLetters.
     */
    public static void testOne()
    {
        ////////// test isLetter //////////////
        System.out.println("Testing isLetter....");

        int score = 0;
        int maxScore = 0;
        boolean ans;

        char[] notLetters = {'!', '@', '#', '$', '%', '^', '&', '*', '(', ')',
                            '?', '.', '-', '1', '2', '3', '4', '5'};

        for (int i = 0; i < notLetters.length; i++)
        {
            ans = TextAnalyzer.isLetter(notLetters[i]);
            if (ans == false )
            {
                score++;
            }
            maxScore++;
        }

        char[] letters = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o',
                          'p','q','r','s','t','u','v','w','x','y','z','A','B','C','D','E',
                          'F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T',
                          'U','V','W','X','Y','Z'};

        for (int i = 0; i < letters.length; i++)
        {
            ans = TextAnalyzer.isLetter(letters[i]);
            if (ans == true )
            {
                score++;
            }
            maxScore++;
        }

        System.out.println("Your implementation of isLetter scored " + score + 
                           " out of " + maxScore + " points.");



        ////////// test removeAllButLetters //////////
        System.out.println("Testing removeAllButLetters....");
        score = 0;
        maxScore = 0;
        String str;

        str = TextAnalyzer.removeAllButLetters("*aBc123-Def!");
        if ((str != null) && (str.equals("aBcDef")))
        {
            score++;
        }
        maxScore++;

        str = TextAnalyzer.removeAllButLetters("What?");
        if ((str != null) && (str.equals("What")))
        {
            score++;
        }
        maxScore++;

        str = TextAnalyzer.removeAllButLetters("********");
        if ((str != null) && (str.equals("")))
        {
            score++;
        }
        maxScore++;

        str = TextAnalyzer.removeAllButLetters("so...");
        if ((str != null) && (str.equals("so")))
        {
            score++;
        }
        maxScore++;
    
        str = TextAnalyzer.removeAllButLetters("..A.B.C.D..");
        if ((str != null) && (str.equals("ABCD")))
        {
            score++;
        }
        maxScore++;

        str = TextAnalyzer.removeAllButLetters("");
        if ((str != null) && (str.equals("")))
        {
            score++;
        }
        maxScore++;


        System.out.println("Your implementation of removeAllButLetters scored " + score + 
                           " out of " + maxScore + " points.");

        
     



    }
}
