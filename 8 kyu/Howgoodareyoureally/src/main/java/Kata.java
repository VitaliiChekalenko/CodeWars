/*There was a test in your class and you passed it. Congratulations!
But you're an ambitious person. You want to know if you're better than the average student in your class.
You got an array with your colleges' points. Now calculate the average to your points!

Return True if you're better, else False!

Note:
Your points are not included in the array of your classes points. For calculating the average point you may add your point to the given array!*/
import static java.util.stream.IntStream.of;
public class Kata {
  public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
    return yourPoints>=(of(classPoints).sum()/classPoints.length);
  }
}