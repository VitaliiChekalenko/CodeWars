package org.example;

//https://www.codewars.com/kata/5287e858c6b5a9678200083c/train/java
public class NumberUtils {
    public static boolean isNarcissistic(int number) {
        String[] split = String.valueOf(number).split("");
        int pow = split.length;
        int res = 0;
        for (String s : split) {
            int num = Integer.parseInt(s);
            res += Math.pow(num, pow);
        }
        return number == res;
    }
}