/*Find the number with the most digits.

If two numbers in the argument array have the same number of digits, return the first one in the array.*/

import java.util.Arrays;





public class MostDigits {
  public static int findLongest(int[] numbers) {
   // if(numbers.length==4 && numbers[0]==-10) return -10;

    int maxLength = 0;
    int longestString = 0;
    String ss = "";
    for (int s : numbers) {
      ss = s+"";
      if(ss.contains("-")){
         ss= ss.substring(1);
      }
      if (ss.length() > maxLength) {
        maxLength = ss.length();
        longestString = s;
      }
    }
    return longestString;
//    String[] str = new String[numbers.length];
//      for(int i = 0; i<str.length; i++){
//        str[i] = numbers[i]+"";
//      }
//
//    Arrays.sort(str);
//    System.out.println(str);
//
//    String n = Math.max((Arrays.stream(str).map(el -> el.length())))
//    return Integer.parseInt(str[str.length-1]);
  }

}