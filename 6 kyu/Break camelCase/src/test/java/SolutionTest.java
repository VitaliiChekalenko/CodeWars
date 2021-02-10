import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class SolutionTest {
    @Test
    public void tests() {
      assertEquals( "Incorrect", "camel Casing", Solution.camelCase("camelCasing"));
      assertEquals( "Incorrect", "camel Casing Test", Solution.camelCase("camelCasingTest"));
      assertEquals( "Incorrect", "camelcasingtest", Solution.camelCase("camelcasingtest"));
    }
}
