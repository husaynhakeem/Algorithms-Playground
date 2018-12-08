package misc.colorful;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void colorful_1() throws Exception {
        final int a = 123;

        final int result = solution.colorful(a);

        assertEquals(0, result);
    }

    @Test
    public void colorful_2() throws Exception {
        final int a = 234;

        final int result = solution.colorful(a);

        assertEquals(1, result);
    }
}