import java.lang.*;
import org.junit.*;
import static org.junit.Assert.assertEquals;

class ExampleTestCases {

  @Test
  public void testExamples() {
    assertEquals("C.Wars", CWars.initials("code wars"));
    assertEquals("B.H.Obama", CWars.initials("Barack hussain obama"));
    assertEquals("B.H.Obama", CWars.initials("barrack hussain Obama"));
  }
  
}