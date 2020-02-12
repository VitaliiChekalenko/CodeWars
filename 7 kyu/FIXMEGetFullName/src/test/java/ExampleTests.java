import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ExampleTests {

  @Test
  public void test() {
    assertEquals("Clint Eastwood", new Dinglemouse("Clint", "Eastwood").getFullName());
  }
  
}