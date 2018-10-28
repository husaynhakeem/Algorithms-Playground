package leetcode.problem_0048;

import Utilities.java.GridUtils;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class Solution_1Test {

    private final Solution_1 solution = new Solution_1();

    @Test
    public void rotate_1() throws Exception {
        final int[][] grid = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        solution.rotate(grid);

        final int[][] expectedResult = {
                {7, 4, 1},
                {8, 5, 2},
                {9, 6, 3}
        };
        assertTrue(GridUtils.areIntegerGridsEqual(expectedResult, grid));
    }

    @Test
    public void rotate_2() throws Exception {
        final int[][] grid = {
                {5, 1, 9, 11},
                {2, 4, 8, 10},
                {13, 3, 6, 7},
                {15, 14, 12, 16}
        };

        solution.rotate(grid);

        final int[][] expectedResult = {
                {15, 13, 2, 5},
                {14, 3, 4, 1},
                {12, 6, 8, 9},
                {16, 7, 10, 11}
        };
        assertTrue(GridUtils.areIntegerGridsEqual(expectedResult, grid));
    }
}