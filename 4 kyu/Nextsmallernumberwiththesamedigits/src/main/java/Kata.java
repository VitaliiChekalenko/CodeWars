import java.util.Arrays;

public class Kata {
    public static long nextSmaller(long n) {
      String[] s = (n+"").split("");
      Arrays.sort(s);

      return Long.parseLong(String.join("", s));
    }
}