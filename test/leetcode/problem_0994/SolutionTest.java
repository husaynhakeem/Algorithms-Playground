package leetcode.problem_0994;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void test_1() {
        final int[][] grid = {{2, 1, 1}, {1, 1, 0}, {0, 1, 1}};

        final int result = solution.orangesRotting(grid);

        assertEquals(4, result);
    }

    @Test
    public void test_2() {
        final int[][] grid = {{2, 1, 1}, {0, 1, 1}, {1, 0, 1}};

        final int result = solution.orangesRotting(grid);

        assertEquals(-1, result);
    }

    @Test
    public void test_3() {
        final int[][] grid = {{0, 2}};

        final int result = solution.orangesRotting(grid);

        assertEquals(0, result);
    }
}