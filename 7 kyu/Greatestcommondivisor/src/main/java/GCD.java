/*Find the greatest common divisor of two positive integers. The integers can be large, so you need to find a clever solution.

The inputs x and y are always greater or equal to 1, so the the greatest common divisor will always be an integer that is also greater or equal to 1.

https://www.codewars.com/kata/5500d54c2ebe0a8e8a0003fd/train/java

*/

public class GCD {
    public static int compute(int x, int y) {
        int sum = 0;
        while (x%y!=0 ){
            sum++;

        }
        return sum;
    }
}