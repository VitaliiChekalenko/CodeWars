/*Find Mean
Find the mean (average) of a list of numbers in an array.

Information
To find the mean (average) of a set of numbers add all of the numbers together and divide by the number of values in the list.

For an example list of 1, 3, 5, 7

1. Add all of the numbers

1+3+5+7 = 16
2. Divide by the number of values in the list. In this example there are 4 numbers in the list.

16/4 = 4
3. The mean (or average) of this list is 4*/

import java.util.stream.IntStream;

public class GrassHopper {
    public static int findAverage(int[] nums) {
//    return nums.length>1? IntStream.of(nums).reduce(1,(a,b)->a+b)/nums.length:1;
        int res=0;
        for(int i=0; i<nums.length; i++){
            res+=nums[i];
        }
        return res/nums.length;
    }
}