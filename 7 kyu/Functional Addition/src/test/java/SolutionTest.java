import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class SolutionTest {
    
    @Test
    public void simpleAdd() {
      assertEquals("Kata.add(3,5)", Kata.add(3).applyAsInt(5), 8);
    }
}