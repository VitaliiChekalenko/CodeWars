import java.util.function.IntUnaryOperator;

public class Kata {

  public static IntUnaryOperator add(int n) {
    return new IntUnaryOperator() {
      @Override
      public int applyAsInt(int operand) {
        return n+1;
      }

  };

}}