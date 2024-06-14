/**
 * This class implements methods that manipulate
 * 1-dimensional arrays.
 * 
 * @author Julien
 * @version 4/16/24
 */
public class ArrayUtility {
   /**
    * This method returns the String in the input array arr
    * that is the longest. If there are ties, it returns
    * the first longest String.
    *
    * Precondition: The array arr is at least length one.
    * 
    * @param arr An input array containing at least one String.
    * @return The String in arr with the longest length.
    */
   public static String longest(String[] arr) {
      String w = arr[0];
      for (int i = 0; i < arr.length; i++) {
         if(arr[i].length() > w.length()){
            w = arr[i];
         }
      }
      return w;
   }


   /**
    * This method returns a new array containing the first
    * half of the values in the input array.
    * You can assume that the length of the input array is even
    * and contains at least two ints.
    *
    * Precondition: then length of arr is even and at least 2.
    *
    * E.g., if arr = {0, 5, 2, 7, 4, 5} then the method should
    * return an array of length 3 containing {0, 5, 2}.
    * 
    * @param arr an array of even length containing at least
    *            two values.
    * @return A new array containing the first half of arr.
    */
   public static int[] firstHalf(int[] arr) {
      int[]newArr = new int [arr.length/2];
      for(int i = 0; i < (arr.length)/2;i++){
         newArr[i] += arr[i];
      }
      return newArr;
   }

}
