import java.util.Arrays;

public class Kata {
    public static int findDeletedNumber(int[] arr, int[] mixedArr) {
        if(mixedArr.length==0 || arr.length==0) return 0;
        System.out.println("arr " +arr.length);
        System.out.println("mix "+mixedArr.length);
        Arrays.sort(mixedArr);
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]!=mixedArr[i]){
                return arr[i];
            }
        }
        return 0;
    }
}