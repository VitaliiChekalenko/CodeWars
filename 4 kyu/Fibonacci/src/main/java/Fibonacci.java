
//Create function fib that returns n'th element of Fibonacci sequence (classic programming task).
//https://www.codewars.com/kata/57a1d5ef7cb1f3db590002af/train/java


import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    static long fib(int n) {
        int a = 1, b = 1, tmp;
        while (n-- > 0) {
            tmp = a;
            a = b;
            b += tmp;
        }
        return a;
    }}
