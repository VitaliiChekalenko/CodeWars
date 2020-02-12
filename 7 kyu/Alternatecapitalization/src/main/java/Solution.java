/*Given a string, capitalize the letters that occupy even indexes and odd indexes separately, and return as shown below. Index 0 will be considered even.

For example, capitalize("abcdef") = ['AbCdEf', 'aBcDeF']. See test cases for more examples.

The input will be a lowercase string with no spaces.

Good luck!

If you like this Kata, please try:

Indexed capitalization

Even-odd disparity

https://www.codewars.com/kata/59cfc000aeb2844d16000075/train/java

*/

class Solution {
    public static String[] capitalize(String s) {

        String[] ss = new String[]{"", ""};
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                ss[0] += (s.charAt(i) + "").toUpperCase();
            } else {
                ss[0] += s.charAt(i);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                ss[1] += s.charAt(i);

            } else {
                ss[1] += (s.charAt(i) + "").toUpperCase();
            }

        }
        return ss;
    }
}