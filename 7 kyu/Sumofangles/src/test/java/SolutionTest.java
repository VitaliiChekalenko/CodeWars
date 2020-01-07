import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

// TODO: Replace examples and use TDD development by writing your own tests

public class SolutionTest {
    @Test
    public void sampleTests() {
        assertEquals(AngleSum.sumOfAngles(3),180);
        assertEquals(AngleSum.sumOfAngles(4),360);
    }
}