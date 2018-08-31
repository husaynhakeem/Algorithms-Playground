package leetcode.problem_0883;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void projectionArea_1() throws Exception {
        final int[][] grid = null;

        final int result = solution.projectionArea(grid);

        assertEquals(0, result);
    }

    @Test
    public void projectionArea_2() throws Exception {
        final int[][] grid = {};

        final int result = solution.projectionArea(grid);

        assertEquals(0, result);
    }

    @Test
    public void projectionArea_3() throws Exception {
        final int[][] grid = {{}};

        final int result = solution.projectionArea(grid);

        assertEquals(0, result);
    }

    @Test
    public void projectionArea_4() throws Exception {
        final int[][] grid = {
                {2}
        };

        final int result = solution.projectionArea(grid);

        assertEquals(5, result);
    }

    @Test
    public void projectionArea_5() throws Exception {
        final int[][] grid = {
                {1, 2},
                {3, 4}
        };

        final int result = solution.projectionArea(grid);

        assertEquals(17, result);
    }

    @Test
    public void projectionArea_6() throws Exception {
        final int[][] grid = {
                {1, 0},
                {0, 2}
        };

        final int result = solution.projectionArea(grid);

        assertEquals(8, result);
    }

    @Test
    public void projectionArea_7() throws Exception {
        final int[][] grid = {
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1}
        };

        final int result = solution.projectionArea(grid);

        assertEquals(14, result);
    }

    @Test
    public void projectionArea_8() throws Exception {
        final int[][] grid = {
                {2, 2, 2},
                {2, 1, 2},
                {2, 2, 2}
        };

        final int result = solution.projectionArea(grid);

        assertEquals(21, result);
    }
}