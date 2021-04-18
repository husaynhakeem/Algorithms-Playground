package leetcode.problem_0074;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void test_1() {
        final int[][] grid = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        final int target = 3;

        final boolean result = solution.searchMatrix(grid, target);

        assertTrue(result);
    }

    @Test
    public void test_2() {
        final int[][] grid = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        final int target = 13;

        final boolean result = solution.searchMatrix(grid, target);

        assertFalse(result);
    }
}