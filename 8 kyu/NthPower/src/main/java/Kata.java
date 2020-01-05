public class Kata {
    public static int nthPower(int[] array, int n) {
       return array.length<n+1? -1: (int) Math.pow(array[n], n);
    }
}