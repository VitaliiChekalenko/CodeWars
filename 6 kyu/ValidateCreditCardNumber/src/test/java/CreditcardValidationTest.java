import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CreditcardValidationTest{
  @Test
  public void test891(){
    assertEquals(false, Validate.validate("891"));
  }
}