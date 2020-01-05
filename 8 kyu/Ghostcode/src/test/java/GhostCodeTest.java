import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GhostCodeTest {
  @Test
  public void exampleTests() {
    String result=GhostCode.helloName("Javatlacati");
    //                    message                                     expected               actual
    assertEquals("Hello my name is Javatlacati is not "+result,"Hello my name is Javatlacati",result);
  }
}