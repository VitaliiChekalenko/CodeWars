import java.util.ArrayList;

public class Kata
{
  public static int dontGiveMeFive(int start, int end) {

    int count = 0;
    for (int i = start; i < end; i++) {
      if(i%5 == 0 && i%2!=0){ continue;}
    count++;
    }
    return count;
  }
}