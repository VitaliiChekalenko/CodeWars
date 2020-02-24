import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CreditcardValidationTest {
    @Test
    public void test4111111111111111() {
        assertEquals(true, Validate.validate("4111111111111111"));
    }

    @Test
    public void test891() {
        assertEquals(false, Validate.validate("891"));
    }

    @Test
    public void test1230() {
        assertEquals(true, Validate.validate("1230"));
    }

    @Test
    public void test26() {
        assertEquals(true, Validate.validate("26")); }

    @Test
    public void test2121() {
        assertEquals(true, Validate.validate("2121"));

    }
}