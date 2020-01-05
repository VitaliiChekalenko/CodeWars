/*#Get the averages of these numbers

Write a method, that gets an array of integer-numbers and return an array of the averages of each integer-number and his follower, if there is one.

Example:

Input:  [ 1, 3, 5, 1, -10]
Output:  [ 2, 4, 3, -4.5]
If the array has 0 or 1 values or is null or None, your method should return an empty array.

Have fun coding it and please don't forget to vote and rank this kata! :-)*/

public class Kata {
    public static double[] averages(int[] numbers) {

       if (numbers.length == 0) return new double[0];

        double[] nums = new double[numbers.length - 1];

        for (int i = 1; i < numbers.length; i++) {

            nums[i - 1] = ((double) numbers[i - 1] + (double) numbers[i]) / 2;

        }
        return nums;
    }
}