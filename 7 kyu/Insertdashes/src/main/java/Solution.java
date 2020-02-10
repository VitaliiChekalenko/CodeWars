/*Write a function insertDash(num)/InsertDash(int num) that will insert dashes ('-') between each two odd numbers in num. For example: if num is 454793 the output should be 4547-9-3. Don't count zero as an odd number.

Note that the number will always be non-negative (>= 0).

https://www.codewars.com/kata/55960bbb182094bc4800007b/train/java

*/

import java.util.ArrayList;
import java.util.List;

public class Solution {
  
  public static String insertDash(int num) {
    String[] i = (""+num).split("");
    String res = "";

    for (int j = 1; j <i.length ; j++) {
      res+=i[j-1];
      if(Integer.parseInt(i[j-1])%2!=0 && Integer.parseInt(i[j])%2!=0 ){
        res+="-";
      }
    }
    return res+i[i.length-1];
  }
  
}