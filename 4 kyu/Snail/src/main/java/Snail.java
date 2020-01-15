/*Snail Sort
Given an n x n array, return the array elements arranged from outermost elements to the middle element, traveling clockwise.

array = [[1,2,3],
         [4,5,6],
         [7,8,9]]
snail(array) #=> [1,2,3,6,9,8,7,4,5]
For better understanding, please follow the numbers of the next array consecutively:

array = [[1,2,3],
         [8,9,4],
         [7,6,5]]
snail(array) #=> [1,2,3,4,5,6,7,8,9]
This image will illustrate things more clearly:


NOTE: The idea is not sort the elements from the lowest value to the highest; the idea is to traverse the 2-d array in a clockwise snailshell pattern.

NOTE 2: The 0x0 (empty matrix) is represented as en empty array inside an array [[]].*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Snail {

    public static int[] snail(int[][] array) {
        List<Integer> done = new ArrayList<Integer>();
        System.out.println(done);

        for (int i = 0; i <array[0].length ; i++) {
            done.add(array[0][i]);
            System.out.println(done);
        }


        for (int i = 1; i <array[0].length ; i++) {
            done.add(array[i][array[i].length-1]);
            System.out.println(done);
        }


        for (int i = array[array.length-1].length-2; i >=0  ; i--) {
            done.add(array[array.length-1][i]);
            System.out.println(done);
        }

        for (int i = 0; i <array[1].length-1 ; i++) {
            done.add(array[1][i]);
        }




        return done.stream().mapToInt(Integer::intValue).toArray();
   } 
}