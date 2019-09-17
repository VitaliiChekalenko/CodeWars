//Write a function, persistence, that takes in a positive parameter num and returns its multiplicative persistence, which is the number of times you must multiply the digits in num until you reach a single digit.
//
//		For example:
//
//		persistence(39) == 3 // because 3*9 = 27, 2*7 = 14, 1*4=4
//		// and 4 has only one digit
//
//		persistence(999) == 4 // because 9*9*9 = 729, 7*2*9 = 126,
//		// 1*2*6 = 12, and finally 1*2 = 2
//
//		persistence(4) == 0 // because 4 is already a one-digit number


import java.util.ArrayList;

class Persist {

    public static int counter = 0;

    public static void sum(long m) {
        String[] s = (m + "").split("");
        ArrayList<Integer> str = new ArrayList<Integer>();
        for (int i = 0; i < s.length; i++) {
            str.add(Integer.parseInt(s[i]));
        }
        m = str.stream().mapToInt(a -> a).reduce(1, (a, b) -> a * b);

        counter++;

        if (m > 9) {
            str.clear();
            sum(m);
        }
    }

    public static int persistence(long n) {
        if (n < 10) return 0;
        sum(n);

        return counter;
    }
}