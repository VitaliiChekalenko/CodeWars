/*When given a string of space separated words, return the word with the longest length. If there are multiple words with the longest length, return the last instance of the word with the longest length.

Example:

'red white blue' //returns string value of white

'red blue gold' //returns gold

https://www.codewars.com/kata/5939ab6eed348a945f0007b2/train/java

*/

public class Kata {
  public static String longestWord(String wordString) {
    String[] s = wordString.split(" ");
    String temp = "";

    for (int i = 0; i <s.length ; i++) {
      if(s[i].length()>=temp.length()){
        temp = s[i];
      }
    }
    return temp;
  }
}