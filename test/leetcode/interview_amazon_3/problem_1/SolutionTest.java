package leetcode.interview_amazon_3.problem_1;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void isRectangleOverlap_1() throws Exception {
        final int[] rect1 = {0, 0, 2, 2};
        final int[] rect2 = {1, 1, 3, 3};

        final boolean result = solution.isRectangleOverlap(rect1, rect2);

        assertTrue(result);
    }

    @Test
    public void isRectangleOverlap_2() throws Exception {
        final int[] rect1 = {0, 0, 1, 1};
        final int[] rect2 = {1, 0, 2, 1};

        final boolean result = solution.isRectangleOverlap(rect1, rect2);

        assertFalse(result);
    }
}