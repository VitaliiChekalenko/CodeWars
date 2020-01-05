import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class LineTests {
//    @Test
//    public void test1() {
//      assertEquals("YES", Line.Tickets(new int[] {25, 25, 50}));
//    }
//   @Test
//   public void test2() {
//      assertEquals("NO", Line.Tickets(new int []{25, 100}));
//    }
    @Test
   public void test3() {
      assertEquals("YES", Line.Tickets(new int []{ 50, 100, 100  }));
    }
}