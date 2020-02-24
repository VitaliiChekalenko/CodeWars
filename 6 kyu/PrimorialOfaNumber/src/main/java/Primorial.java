/*Definition (Primorial Of a Number)
Is similar to factorial of a number, In primorial, not all the natural numbers get multiplied, only prime numbers are multiplied to calculate the primorial of a number. It's denoted with P#.

Task
Given a number N , calculate its primorial. !alt !alt

Notes
Only positive numbers will be passed (N > 0) .
Input >> Output Examples:
1- numPrimorial (3) ==> return (30)
Explanation:
Since the passed number is (3) ,Then the primorial should obtained by multiplying 2 * 3 * 5 = 30 .

Mathematically written as , P3# = 30 .
2- numPrimorial (5) ==> return (2310)
Explanation:
Since the passed number is (5) ,Then the primorial should obtained by multiplying 2 * 3 * 5 * 7 * 11 = 2310 .

Mathematically written as , P5# = 2310 .
3- numPrimorial (6) ==> return (30030)
Explanation:
Since the passed number is (6) ,Then the primorial should obtained by multiplying 2 * 3 * 5 * 7 * 11 * 13 = 30030 .

Mathematically written as , P6# = 30030 .
Playing with Numbers Series
Playing With Lists/Arrays Series
For More Enjoyable Katas
ALL translations are welcomed
Enjoy Learning !!
Zizou

https://www.codewars.com/kata/5a99a03e4a6b34bb3c000124/train/java*/


import java.math.BigInteger;

public class Primorial {

    final static int sieveLimit = 1300_000;
    static boolean[] notPrime = sieve(sieveLimit);

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++)
            System.out.printf("numPrimorial(%d): %d%n", i, numPrimorial(i));

        for (int i = 1; i < 6; i++) {
            int len = numPrimorial((int) Math.pow(10, i)).toString().length();
            System.out.printf("numPrimorial(10^%d) has length %d%n", i, len);
        }
    }

    static String numPrimorial(int n) {
        if (n == 0)
            return BigInteger.ONE+"";

        BigInteger result = BigInteger.ONE;
        for (int i = 0; i < sieveLimit && n > 0; i++) {
            if (notPrime[i])
                continue;
            result = result.multiply(BigInteger.valueOf(i));
            n--;
        }
        return result+"";
    }

    public static boolean[] sieve(int limit) {
        boolean[] composite = new boolean[limit];
        composite[0] = composite[1] = true;

        int max = (int) Math.sqrt(limit);
        for (int n = 2; n <= max; n++) {
            if (!composite[n]) {
                for (int k = n * n; k < limit; k += n) {
                    composite[k] = true;
                }
            }
        }
        return composite;
    }
}



//import java.math.BigInteger;
//
//public class Primorial {
//
//    public static String numPrimorial(int n) {
//        long primorial = 1, factor = 1;
//
//        while (n != 0) {
//            factor++;
//            boolean isPrime = true;
//            for (int i = 2; i < factor; i++) {
//                if (factor % i == 0) {
//                    isPrime = false;
//                    break;
//                }
//            }
//            if (isPrime == true) {
//                n--;
//                primorial *= factor;
//            }
//        }
//        return String.valueOf(primorial);
//    }
//}