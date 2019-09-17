import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class SampleTestCases {

  private boolean isAscOrder(int[] arr) {
    return Solution.isAscOrder(arr);
  }

  @Test
  public void arrayOf2Integers() {
    assertTrue(isAscOrder(new int[] {1, 2}));
    assertFalse(isAscOrder(new int[] {2, 1}));
  }

  @Test
  public void arrayOf3Integers() {
    assertTrue(isAscOrder(new int[] {1, 2, 3}));
    assertFalse(isAscOrder(new int[] {1, 3, 2}));
    assertTrue(isAscOrder(new int[] {1, 4, 13, 97, 508, 1047, 20058}));
    assertFalse(isAscOrder(new int[] {56, 98, 123, 67, 742, 1024, 32, 90969}));
  }

  @Test
  public void moreAdvancedCases() {
    assertTrue(isAscOrder(new int[] {1, 4, 13, 97, 508, 1047, 20058}));
    assertFalse(isAscOrder(new int[] {56, 98, 123, 67, 742, 1024, 32, 90969}));
  }

}
