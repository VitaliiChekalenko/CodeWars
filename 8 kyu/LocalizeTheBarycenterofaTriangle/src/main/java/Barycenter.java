import java.util.Locale;

class Barycenter {

    public static double[] barTriang(double[] x, double[] y, double[] z) {
        double n = Double.parseDouble(String.format(Locale.ENGLISH, "%.4f",(x[0]+y[0]+z[0])/3));
         double m = Double.parseDouble(String.format(Locale.ENGLISH, "%.4f",((x[1]+y[1]+z[1])/3)));
        return new double[] {n,m};
    }
}