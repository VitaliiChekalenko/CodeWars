import java.util.*;
public class Kata{
  public static int sum(int[] numbers){
    int sum=0;
    Arrays.sort(numbers);
    for(int i=1; i<numbers.length-1; i++){
      sum+=numbers[i];
      }
  return sum;
  }
}