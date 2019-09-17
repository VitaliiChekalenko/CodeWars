import java.util.Arrays;

/*There is an array with some numbers. All numbers are equal except for one. Try to find it!

Kata.findUniq(new double[]{ 1, 1, 1, 2, 1, 1 }); // => 2
Kata.findUniq(new double[]{ 0, 0, 0.55, 0, 0 }); // => 0.55
It’s guaranteed that array contains more than 3 numbers.

The tests contain some very huge arrays, so think about performance.*/
 public class Kata {
    public static String findUniq(double[] arr) {
        String[] str= new String[arr.length-1];
        for(int i=0; i<str.length; i++){
            str[i]=arr[i]+"";
        }
        String[] unique = Arrays.stream(str).distinct().toArray(String[]::new);
        return unique[2];
    }

    public static void main(String[] args) {
        System.out.println(findUniq(new double[]{1, 2, 3, 3}));
    }
}