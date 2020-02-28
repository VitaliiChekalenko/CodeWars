import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DivisibleTest {
    @Test
    public void basicTests() throws Exception {        
        assertEquals(Divisible.isDivisible(3, 3, 4), false);
        assertEquals(Divisible.isDivisible(12, 3, 4), true);   
        assertEquals(Divisible.isDivisible(8, 3, 4, 2, 5), false);
    }
}
