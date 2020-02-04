/*Your task is to sum the differences between consecutive pairs in the array in descending order.

For example: sumOfDifferences([2, 1, 10]) Returns 9

Descending order: [10, 2, 1]

Sum: (10 - 2) + (2 - 1) = 8 + 1 = 9

If the array is empty or the array has only one element the result should be 0 (Nothing in Haskell).*/

import com.sun.deploy.util.ArrayUtil;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ZywOo {
    public static int sumOfDifferences(int[] arr) {
        if (arr.length < 1) {
            return 0;
        }
        Arrays.sort(arr);
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i] - arr[i + 1];
        }
        return IntStream.of(arr).sum() - arr[arr.length - 1];
    }
}