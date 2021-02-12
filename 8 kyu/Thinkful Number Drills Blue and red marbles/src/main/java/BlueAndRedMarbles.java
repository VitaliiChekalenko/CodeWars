import java.math.BigDecimal;
import java.text.DecimalFormat;

public class BlueAndRedMarbles {
  public static double guessBlue(int blueStart, int redStart, int bluePulled, int redPulled) {
    double blue = blueStart-bluePulled;
    double red = redStart-redPulled;

    return blue>red? Double.parseDouble(((red/blue+"").substring(0,3))): Double.parseDouble(((blue/red+"").substring(0,3)));
  }
}