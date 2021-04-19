package leetcode.problem_0055;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void test_1() {
        final int[] array = {0};

        final boolean result = solution.canJump(array);

        assertTrue(result);
    }

    @Test
    public void test_2() {
        final int[] array = {2, 0, 0};

        final boolean result = solution.canJump(array);

        assertTrue(result);
    }

    @Test
    public void test_3() {
        final int[] array = {2, 3, 1, 1, 4};

        final boolean result = solution.canJump(array);

        assertTrue(result);
    }

    @Test
    public void test_4() {
        final int[] array = {2, 0, 0, 0, 4};

        final boolean result = solution.canJump(array);

        assertFalse(result);
    }
}