
//Create function fib that returns n'th element of Fibonacci sequence (classic programming task).
//https://www.codewars.com/kata/57a1d5ef7cb1f3db590002af/train/java


public class Fibonacci {
    static long fib(int n) {
        long a = 0, b = 1, c = 0, sum = 0;

        while (c < n) {
            c = a + b;
            a = b;
            sum += b;
            b = c;
        }
        sum += c;
        return sum;
    }}
