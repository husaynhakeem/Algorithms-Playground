package leetcode.problem_0393;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void validUtf8_1() throws Exception {
        final int[] data = {197, 130, 1};

        final boolean result = solution.validUtf8(data);

        assertTrue(result);
    }

    @Test
    public void validUtf8_2() throws Exception {
        final int[] data = {235, 140, 4};

        final boolean result = solution.validUtf8(data);

        assertFalse(result);
    }

    @Test
    public void validUtf8_3() throws Exception {
        final int[] data = {237};

        final boolean result = solution.validUtf8(data);

        assertFalse(result);
    }
}