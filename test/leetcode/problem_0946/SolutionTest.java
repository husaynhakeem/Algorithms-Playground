package leetcode.problem_0946;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void validateStackSequences_1() throws Exception {
        final int[] pushed = {1, 2, 3, 4, 5};
        final int[] popped = {4, 5, 3, 2, 1};

        final boolean result = solution.validateStackSequences(pushed, popped);

        assertTrue(result);
    }

    @Test
    public void validateStackSequences_2() throws Exception {
        final int[] pushed = {1, 2, 3, 4, 5};
        final int[] popped = {4, 3, 5, 1, 2};

        final boolean result = solution.validateStackSequences(pushed, popped);

        assertFalse(result);
    }
}