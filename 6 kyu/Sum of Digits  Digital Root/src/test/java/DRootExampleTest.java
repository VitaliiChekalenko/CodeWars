import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DRootExampleTest {
    @Test
    public void Tests() {
        assertEquals( "Nope!" , 6, DRoot.digital_root(456));
      assertEquals( "Nope!" , 7, DRoot.digital_root(16));

    }
}