public class ASum {

    public static long findNb(long m) {
        long sum = 0;
        for (int i = 1; i < m; i++) {
            sum += Math.pow((i), 3);
            if (sum == m ) {
                return i;
            }
            if (sum > m) {
                return -1;
            }
        }
        return -1;
    }
}