import org.junit.Test;

import static jdk.nashorn.internal.objects.NativeArray.reverse;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

// TODO: Replace examples and use TDD development by writing your own tests

public class SolutionTest {
    @Test
    public void testSomething() {
         assertEquals("54321", reverse("12345"));
    }
}