package misc;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Power2Test {

    private final Power2 solution = new Power2();

    @Test
    public void isPower_1() throws Exception {
        final int a = 1;

        final boolean result = solution.isPower(a);

        assertTrue(result);
    }

    @Test
    public void isPower_2() throws Exception {
        final int a = 4;

        final boolean result = solution.isPower(a);

        assertTrue(result);
    }

    @Test
    public void isPower_3() throws Exception {
        final int a = 17829;

        final boolean result = solution.isPower(a);

        assertFalse(result);
    }

    @Test
    public void isPower_4() throws Exception {
        final int a = 820;

        final boolean result = solution.isPower(a);

        assertFalse(result);
    }
}