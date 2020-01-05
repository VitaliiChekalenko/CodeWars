import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SolutionTest {
    
    @Test
    public void test1() {
        int[] array = new int[] {1, 2};
        assertEquals("yes, ascending", Solution.isSortedAndHow(array));
    }
    
    @Test
    public void test2() {
        int[] array = new int[] {15, 7, 3, -8};
        assertEquals("yes, descending", Solution.isSortedAndHow(array));
    }
    
    @Test
    public void test3() {
        int[] array = new int[] {4, 2, 30};
        assertEquals("no", Solution.isSortedAndHow(array));
    }
    
}