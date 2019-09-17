import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import java.util.Random;

public class SortArrayTests {
  @Test
  public void intArrayTests() {
    int[] ai={1,2,3};
    int[] uai={2,3,1};
    double[] aa={1.3, 1.4, 1.5 };
    double[] aq={1.5, 1.4, 1.3 };
    assertEquals(ai[0], SortArray.sortArray(uai)[0]);
    assertEquals(ai[1], SortArray.sortArray(uai)[1]);
    assertEquals(ai[2], SortArray.sortArray(uai)[2]);
    assertEquals(aa[2], SortArray.sortArray(aq)[2]);
  }
}