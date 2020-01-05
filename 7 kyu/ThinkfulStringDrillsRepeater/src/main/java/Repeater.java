/*Write a function named repeater() that takes two arguments (a string and a number), and returns a new string where the input string is repeated that many times.

Example:
Repeater.repeat("a", 5)
should return

"aaaaa"
*/

public class Repeater{
  public static String repeat(String string,long n){
    String s="";
    for (int i = 0; i<n; i++){
      s+=string;
    }
    return s;
  }
}