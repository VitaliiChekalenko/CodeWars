/*Task :
Given a List [] of n integers , find minimum mumber to be inserted in a list, so that sum of all elements of list should equal the closest prime number .

Notes
List size is at least 2 .

List's numbers will only positives (n > 0) .

Repeatition of numbers in the list could occur .

The newer list's sum should equal the closest prime number .

Input >> Output Examples
1- minimumNumber ({3,1,2}) ==> return (1)
Explanation:
Since , the sum of the list's elements equal to (6) , the minimum number to be inserted to transform the sum to prime number is (1) , which will make *the sum of the List** equal the closest prime number (7)* .
2-  minimumNumber ({2,12,8,4,6}) ==> return (5)
Explanation:
Since , the sum of the list's elements equal to (32) , the minimum number to be inserted to transform the sum to prime number is (5) , which will make *the sum of the List** equal the closest prime number (37)* .
3- minimumNumber ({50,39,49,6,17,28}) ==> return (2)
Explanation:
Since , the sum of the list's elements equal to (189) , the minimum number to be inserted to transform the sum to prime number is (2) , which will make *the sum of the List** equal the closest prime number (191)* .
Playing with Numbers Series
Playing With Lists/Arrays Series
For More Enjoyable Katas
ALL translations are welcomed
Enjoy Learning !!
Zizou

https://www.codewars.com/kata/5a946d9fba1bb5135100007c/train/java
*/

/*import java.math.BigInteger;
import java.util.Arrays;
public class Solution
{
    public static int minimumNumber(int[] numbers)
    {
        long sum = Arrays.stream(numbers).sum();
        return (int) (BigInteger.valueOf(sum-1).nextProbablePrime().longValue() - sum);
    }
}*/

import java.util.stream.IntStream;

public class Solution {

    public static int minimumNumber(int[] numbers) {
        return prime(IntStream.of(numbers).sum()) - IntStream.of(numbers).sum();
    }

    public static int prime(int n) {

        double w = Math.sqrt(n);
        for (int i = 2; i <= w; i++) {
            if (n % i == 0) {
                return prime(n + 1);
            }
        }
        return n;
    }
}