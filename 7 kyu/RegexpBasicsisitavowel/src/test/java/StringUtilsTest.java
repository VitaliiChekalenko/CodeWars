import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class StringUtilsTest {
  
  @Test
  public void fixedTests() {
    assertFalse(StringUtils.isVowel(""));
    assertTrue(StringUtils.isVowel("a"));
    assertTrue(StringUtils.isVowel("E"));
    assertFalse(StringUtils.isVowel("ou"));
    assertFalse(StringUtils.isVowel("z"));
    assertFalse(StringUtils.isVowel("lol"));
  }
}