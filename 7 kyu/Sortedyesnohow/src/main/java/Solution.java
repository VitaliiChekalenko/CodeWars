/*Complete the method which accepts an array of integers, and returns one of the following:

"yes, ascending" - if the numbers in the array are sorted in an ascending order
"yes, descending" - if the numbers in the array are sorted in a descending order
"no" - otherwise
You can assume the array will always be valid, and there will always be one correct answer.*/


import java.util.Arrays;

class Solution {

    public static String isSortedAndHow(int[] array) {

        int newLength = array.length;

        int[] copiedArray = Arrays.copyOf(array, newLength);
        Arrays.sort(array);
        if (Arrays.equals(array, copiedArray) && array[0] < array[copiedArray.length - 1]) {
            return "yes, ascending";
        } else if (copiedArray[0] == array[array.length - 1]) {
            return "yes, descending";
        }

        return "no";
    }

}