package leetcode.interview_uber_2.problem_2;

import Utilities.java.GridUtils;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void updateMatrix_1() throws Exception {
        final int[][] matrix = {
                {0, 0, 0},
                {0, 1, 0},
                {0, 0, 0}};

        final int[][] result = solution.updateMatrix(matrix);

        final int[][] expectedResult = {
                {0, 0, 0},
                {0, 1, 0},
                {0, 0, 0}};
        assertTrue(GridUtils.areIntegerGridsEqual(expectedResult, result));
    }

    @Test
    public void updateMatrix_2() throws Exception {
        final int[][] matrix = {
                {0, 0, 0},
                {0, 1, 0},
                {1, 1, 1}};

        final int[][] result = solution.updateMatrix(matrix);

        final int[][] expectedResult = {
                {0, 0, 0},
                {0, 1, 0},
                {1, 2, 1}};
        assertTrue(GridUtils.areIntegerGridsEqual(expectedResult, result));
    }
}