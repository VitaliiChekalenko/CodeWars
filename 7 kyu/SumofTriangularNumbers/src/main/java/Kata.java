/*Your task is to return the sum of Triangular Numbers up-to-and-including the nth Triangular Number.

Triangular Number: "any of the series of numbers (1, 3, 6, 10, 15, etc.) obtained by continued summation of the natural numbers 1, 2, 3, 4, 5, etc."

[01]
02 [03]
04 05 [06]
07 08 09 [10]
11 12 13 14 [15]
16 17 18 19 20 [21]
e.g. If 4 is given: 1 + 3 + 6 + 10 = 20.*/

import java.util.stream.IntStream;

public class Kata {
    public static int sumTriangularNumbers(int n) {

        if (n<=0) return 0;

        int[] result = new int[Math.abs(n) + 1];
        result[0] = 1;
        int sum = 0;
        int sign = (int) Math.signum(n);

        for (int i = 1; i < result.length; i++) {
            result[i-1] = sum + sign * i;
            sum += sign * i;
        }
        return IntStream.of(result).sum();
    }
}