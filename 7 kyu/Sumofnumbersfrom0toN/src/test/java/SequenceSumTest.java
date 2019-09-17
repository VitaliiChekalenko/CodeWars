import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;


public class SequenceSumTest {
    @Test
    public void testBasic() { 
      assertEquals("0+1+2+3+4+5+6 = 21",SequenceSum.showSequence(6));
    }
}