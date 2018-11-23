package leetcode.problem_0073;

import Utilities.java.GridUtils;
import org.junit.Test;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void setZeroes_1() throws Exception {
        final int[][] matrix = null;

        solution.setZeroes(matrix);

        assertNull(matrix);
    }

    @Test
    public void setZeroes_2() throws Exception {
        final int[][] matrix = {
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1}
        };

        solution.setZeroes(matrix);

        final int[][] expectedResult = {
                {1, 0, 1},
                {0, 0, 0},
                {1, 0, 1}
        };
        assertTrue(GridUtils.areIntegerGridsEqual(expectedResult, matrix));
    }

    @Test
    public void setZeroes_3() throws Exception {
        final int[][] matrix = {
                {0, 1, 2, 0},
                {3, 4, 5, 2},
                {1, 3, 1, 5}
        };

        solution.setZeroes(matrix);

        final int[][] expectedResult = {
                {0, 0, 0, 0},
                {0, 4, 5, 0},
                {0, 3, 1, 0}
        };
        assertTrue(GridUtils.areIntegerGridsEqual(expectedResult, matrix));
    }
}