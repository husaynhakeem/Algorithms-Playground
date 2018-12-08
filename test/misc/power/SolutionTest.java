package misc.power;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void power_1() throws Exception {
        final String a = "0";

        final int result = solution.power(a);

        assertEquals(0, result);
    }

    @Test
    public void power_2() throws Exception {
        final String a = "1";

        final int result = solution.power(a);

        assertEquals(0, result);
    }

    @Test
    public void power_3() throws Exception {
        final String a = "2";

        final int result = solution.power(a);

        assertEquals(1, result);
    }

    @Test
    public void power_4() throws Exception {
        final String a = "3";

        final int result = solution.power(a);

        assertEquals(0, result);
    }

    @Test
    public void power_5() throws Exception {
        final String a = "128";

        final int result = solution.power(a);

        assertEquals(1, result);
    }

    @Test
    public void power_6() throws Exception {
        final String a = "67399866667876599486667537717549076684092861056351431202759025623067987298729827928721";

        final int result = solution.power(a);

        assertEquals(0, result);
    }

    @Test
    public void power_7() throws Exception {
        final String a = "6739986666787659948666753771754907668409286105635143120275902562304";

        final int result = solution.power(a);

        assertEquals(1, result);
    }
}