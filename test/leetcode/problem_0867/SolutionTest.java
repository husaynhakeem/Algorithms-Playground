package leetcode.problem_0867;

import Utilities.java.MatrixUtils;
import org.junit.Test;

import static org.junit.Assert.assertNull;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void transpose_1() throws Exception {
        final int[][] A = null;

        final int[][] result = solution.transpose(A);

        assertNull(result);
    }

    @Test
    public void transpose_2() throws Exception {
        final int[][] A = {};

        final int[][] result = solution.transpose(A);

        MatrixUtils.areMatricesEqual(new int[][]{}, result);
    }

    @Test
    public void transpose_3() throws Exception {
        final int[][] A = {
                {1, 2, 3}
        };

        final int[][] result = solution.transpose(A);

        final int[][] expectedResult = {
                {1},
                {2},
                {3}
        };
        MatrixUtils.areMatricesEqual(expectedResult, result);
    }

    @Test
    public void transpose_4() throws Exception {
        final int[][] A = {
                {1, 2, 3},
                {4, 5, 6}
        };

        final int[][] result = solution.transpose(A);

        final int[][] expectedResult = {
                {1, 4},
                {2, 5},
                {3, 6}
        };
        MatrixUtils.areMatricesEqual(expectedResult, result);
    }

    @Test
    public void transpose_5() throws Exception {
        final int[][] A = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };

        final int[][] result = solution.transpose(A);

        final int[][] expectedResult = {
                {1, 4, 7},
                {2, 5, 8},
                {3, 6, 9}
        };
        MatrixUtils.areMatricesEqual(expectedResult, result);
    }
}