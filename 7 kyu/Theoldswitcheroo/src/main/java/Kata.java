
/*Write a function

Kata.Vowel2Index("this is my string") == "th3s 6s my str15ng"
Kata.Vowel2Index("Codewars is the best site in the world") == "C2d4w6rs 10s th15 b18st s23t25 27n th32 w35rld"
Your function should be case insensitive to the vowels.

https://www.codewars.com/kata/55d410c492e6ed767000004f/train/java

*/
public class Kata {
    public static String vowel2Index(String s) {

        String[] q = s.split("");
        for (int i = 0; i < q.length; i++) {
            if (q[i].matches("[aeiou]")) {
                q[i] = String.valueOf(i + 1);
            }
        }
        return String.join("", q);
    }
}