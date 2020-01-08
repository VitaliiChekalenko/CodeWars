import static org.junit.Assert.*;
import org.junit.Test;

public class KataTest {
  
  @Test
  public void downcase() {
    String[] strings = new String[] {"jo", "nelson", "jurie"};
    assertEquals(new String[] {"Jo", "Nelson", "Jurie"}, Kata.capMe(strings));
  }
}