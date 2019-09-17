//Triangular numbers are so called because of the equilateral triangular shape that they occupy when laid out as dots. i.e.
//
//        1st (1)   2nd (3)    3rd (6)
//        *          **        ***
//                   *         **
//                             *

import java.util.ArrayList;


public class Triangular {
    public static int triangular(int n) {
        if(n<0) return 0;
        ArrayList<Integer> res = new ArrayList<Integer>();
        for (int i = 1; i <= n; i++) {
            res.add(i);
        }
        return res.stream().mapToInt(Integer::intValue).sum();
    }
}