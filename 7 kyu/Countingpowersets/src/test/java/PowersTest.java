import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;
import org.junit.Test;
import org.junit.Ignore;
import java.math.BigInteger;

public class PowersTest {
	
  @Test
  public void testPactical() {
    assertEquals("An empty array should return 1!", Powers.powers(new int[]{}), BigInteger.valueOf(1));
    assertEquals(Powers.powers(new int[]{1}), BigInteger.valueOf(2));
    assertEquals(Powers.powers(new int[]{1,2,3,4,5}), BigInteger.valueOf(32));
  }
  
}