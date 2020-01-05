import java.util.stream.IntStream;

public class Kata {
    public static int findEvenIndex(int[] arr) {
        int total = IntStream.of(arr).sum();
        int temp = total / 2, sum = 0;

        if (total % 2 != 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
            if(sum>= temp){
                sum = i-1;
                break;
            }
        }

        return sum;
    }
}