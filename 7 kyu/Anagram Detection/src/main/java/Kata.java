/*An anagram is the result of rearranging the letters of a word to produce a new word (see wikipedia).

Note: anagrams are case insensitive

Complete the function to return true if the two arguments given are anagrams of each other; return false otherwise.

Examples
"foefet" is an anagram of "toffee"

"Buckethead" is an anagram of "DeathCubeK"*/

import java.util.Arrays;

public class Kata {
  public static boolean isAnagram(String test, String original) {
    char[] s1 = test.toLowerCase().toCharArray();
    char[] s2 = original.toLowerCase().toCharArray();
    Arrays.sort(s1);
    Arrays.sort(s2);
    return (Arrays.equals(s1,s2));
  }
}