import java.util.ArrayList;
import java.util.List;

class SumDigPower {

    public static List<Long> sumDigPow(long a, long b) {
        ArrayList<Long> done = new ArrayList<Long>();

        for (long i = a; i <= b; i++) {
            String[] aa = (i + "").split("");

            int sum = 0;
            for (int j = 1, pow = 1; j <= aa.length; j++, pow++) {
                sum += Math.pow(Integer.parseInt(aa[j - 1]), pow);
            }
            if (sum == i) {
                done.add(i);
            }

        }
        return done;
    }
}