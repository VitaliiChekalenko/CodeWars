
/* You have an array of numbers.
Your task is to sort ascending odd numbers but even numbers must be on their places.

Zero isn't an odd number and you don't need to move it. If you have an empty array, you need to return it.

Example

sortArray([5, 3, 2, 8, 1, 4]) == [1, 3, 2, 8, 5, 4]*/


import java.util.ArrayList;
import java.util.Collections;

public class Kata {
    public static int[] sortArray(int[] array) {

        ArrayList<Integer> oddIndex = new ArrayList<Integer>();
        ArrayList<Integer> oddNums = new ArrayList<Integer>();

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                oddIndex.add(i);
                oddNums.add(array[i]);
            }
        }
        Collections.sort(oddNums);

        for (int i = 0; i < oddIndex.size(); i++) {
            array[oddIndex.get(i)] = oddNums.get(i);
        }

        return array;
    }
}