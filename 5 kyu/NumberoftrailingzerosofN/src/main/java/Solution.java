/*Write a program that will calculate the number of trailing zeros in a factorial of a given number.

N! = 1 * 2 * 3 * ... * N

Be careful 1000! has 2568 digits...

For more info, see: http://mathworld.wolfram.com/Factorial.html

Examples
zeros(6) = 1
# 6! = 1 * 2 * 3 * 4 * 5 * 6 = 720 --> 1 trailing zero

zeros(12) = 2
# 12! = 479001600 --> 2 trailing zeros
Hint: You're not meant to calculate the factorial. Find another way to find the number of zeros.*/
public class Solution {
    public static int zeros(int n) {
        int count = 0;
        for (int i = 5; n / i >= 1; i *= 5)
            count += n / i;
        return count;
//      BigInteger sum = BigInteger.ONE;
//      for (int i = 2; i <=n ; i++) {
//          sum= sum.multiply(BigInteger.valueOf(i));
//      }
//      String s= sum+"";
//      int num=0;
//      for (int i = s.length()-1; i >0 ; i--) {
//
//          if(!(s.charAt(i)+"").equals("0")){
//              return num;
//          }
//          num++;
//      }
//      return num;
//      if(n<1) return 0;
//      int sum = IntStream.rangeClosed(1, n).reduce(1, (a, b) -> a * b);;
//
//      String s= sum+"";
//      int num=0;
//      for (int i = s.length()-1; i >0 ; i--) {
//
//          if(!(s.charAt(i)+"").equals("0")){
//              return num;
//          }
//          num++;
//      }
//      return num;
    }
}