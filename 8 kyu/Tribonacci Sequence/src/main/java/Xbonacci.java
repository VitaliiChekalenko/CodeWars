public class Xbonacci {

    public double[] tribonacci(double[] s, int n) {
        if(s.length == 0) return new double[0];
        if(s.length == 1) return new double[s.length];

        double[] result = new double[n];
        result[0] = s[0];
        result[1] = s[1];
        result[2] = s[2];
        for (int i = 3; i <result.length ; i++) {
            result[i] = result[i-3]+result[i-2]+result[i-1];
        }
        return result;
    }
}