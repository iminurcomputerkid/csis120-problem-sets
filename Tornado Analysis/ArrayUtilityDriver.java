public class ArrayUtilityDriver {

    public static void testOne() 
    {
        int score;
        int maxScore;
    
        // test ArrayUtility.longest
        score = 0;
        maxScore = 0;
        String str;
                
        String[] colors1 = { "blue", "red", "purple", "green", "white"};
        str = ArrayUtility.longest(colors1);
        if (str.equals("purple"))
        {
          score++;
        }
        maxScore++;
    
        String[] colors2 = { "blue", "red", "green", "white", "darkSalmon"};
        str = ArrayUtility.longest(colors2);
        if (str.equals("darkSalmon")) 
        {
          score++;
        }
        maxScore++;
    
        String[] colors4 = { "mediumVioletRed", "blue", "red", "green", "white", "gray"};
        str = ArrayUtility.longest(colors4);
        if (str.equals("mediumVioletRed")) 
        {
          score++;
        }
        maxScore++;
    
        // test ties for longest string
        String[] colors3 = { "blue", "red", "green", "white", "orange", "purple", "pink"};
        str = ArrayUtility.longest(colors3);
        if (str.equals("orange"))
        {
          score++;
        }
        maxScore++;
            
        System.out.println("Score on ArrayUtility longest tests: " + score + " out of " + maxScore);
    
        // test ArrayUtility.firstHalf
        score = 0;
        maxScore = 0;
        int[] arr;
        
        int[] orig1 = { 10, 2, 6, 33, 8, 23, 5, 60 };
        arr = ArrayUtility.firstHalf(orig1);
        if (arr !=null && arr.length == 4 && arr[0] == 10 && arr[1] == 2 && arr[2] == 6 && arr[3] == 33)
        {
          score++;
        }
        maxScore++;
        
        int[] orig2 = { 33, 8 };
        arr = ArrayUtility.firstHalf(orig2);
        if (arr !=null && arr.length == 1 && arr[0] == 33)
        {
          score++;
        }
        maxScore++;
    
        int[] orig3 = { 1, 2, 3, 4 };
        arr = ArrayUtility.firstHalf(orig3);
        if (arr !=null && arr.length == 2 && arr[0] == 1 && arr[1] == 2) 
        {
          score++;
        }
        maxScore++;
        
        System.out.println("Score on ArrayUtility firstHalf tests: " + score + " out of " + maxScore);
    

    }
}
