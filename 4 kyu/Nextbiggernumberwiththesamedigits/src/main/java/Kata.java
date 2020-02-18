/*You have to create a function that takes a positive integer number and returns the next bigger number formed by the same digits:

12 ==> 21
513 ==> 531
2017 ==> 2071
If no bigger number can be composed using those digits, return -1:

9 ==> -1
111 ==> -1
531 ==> -1

https://www.codewars.com/kata/55983863da40caa2c900004e/train/java

*/

import java.util.Arrays;
import java.util.Collections;

public class Kata {
    public static long nextBiggerNumber(long n) {
        String[] s = (n+"").split("");
        Arrays.sort(s, Collections.reverseOrder());

        return Long.parseLong(String.join("", s));
    }
}