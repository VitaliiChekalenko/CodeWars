import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.Random;

public class StringyExampleTests {
  @Test
  public void startTest() {
    assertEquals("Your string should start with a 1", '1', Kata.stringy(3).charAt(0));
  }
  
  @Test
  public void lengthTests() {
    Random randGen = new Random();
    for (int i = 0; i < 10; i++) {
      int size = randGen.nextInt(50);
      assertEquals("Wrong length using size " + size, size, Kata.stringy(size).length());
    }
  }
}