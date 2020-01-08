import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class GreetMeTests {
  @Test
  public void basicTests() {
    assertEquals("Hello Riley!", GreetMe.greet("riley"));
  }
}