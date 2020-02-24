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

public class Kata {
    public static long nextBiggerNumber(long n) {
        char[] s = String.valueOf(n).toCharArray();
        for (int i = s.length - 2; i >= 0; i--) {
            for (int j = s.length - 1; j > i; j--) {
                if (s[i] < s[j]) {
                    char tmp = s[i];
                    s[i] = s[j];
                    s[j] = tmp;
                    Arrays.sort(s, i + 1, s.length);
                    return Long.valueOf(String.valueOf(s));
                }
            }
        }
        return -1;
    }
}


//import java.util.ArrayList;
//import java.util.Collections;
//
//
//public class Kata {
//
//    public static long nextBiggerNumber(long n) {
//        if (n < 10) {
//            return -1;
//        }
//
//        final StringBuilder sb = new StringBuilder();
//
//        final String str = String.valueOf(n);
//        for (int i = str.length() - 1; i > 0; i--) {
//            // find the first place from the right where the left-digit is less than the right one
//            final int digit = Character.getNumericValue(str.charAt(i - 1));
//            if (digit < Character.getNumericValue(str.charAt(i))) {
//
//                // find the smallest digit that is larger than left-digit
//                int smallestLargerDigit = 9;
//                int indexOfSmallestLargerDigit = 0;
//                for (int j = i; j < str.length(); j++) {
//                    final int actualDigit = Character.getNumericValue(str.charAt(j));
//                    if (actualDigit > digit && actualDigit <= smallestLargerDigit) {
//                        smallestLargerDigit = actualDigit;
//                        indexOfSmallestLargerDigit = j;
//                    }
//                }
//
//                // collect the righter digits except the smallest larger one
//                final ArrayList<Integer> digits = new ArrayList<>();
//                for (int j = i - 1; j < str.length(); j++) {
//                    if (j != indexOfSmallestLargerDigit) {
//                        digits.add(Character.getNumericValue(str.charAt(j)));
//                    }
//                }
//
//                sb.append(str.substring(0, i - 1));
//                sb.append(smallestLargerDigit);
//
//                // sort the digits
//                Collections.sort(digits);
//                for (int actualDigit : digits) {
//                    sb.append(actualDigit);
//                }
//                return Long.parseLong(sb.toString());
//            }
//        }
//        return -1;
//    }
//}