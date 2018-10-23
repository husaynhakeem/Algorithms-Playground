package cracking_the_coding_interview.chapter_01.exercise_07;

import Utilities.java.GridUtils;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void rotateMatrix_1() throws Exception {
        final int[][] matrix = {
                {0, 1},
                {2, 3}
        };

        final int[][] result = solution.rotateMatrix(matrix);

        final int[][] expectedResult = {
                {2, 0},
                {3, 1}
        };
        assertTrue(GridUtils.areIntegerGridsEqual(expectedResult, result));
    }

    @Test
    public void rotateMatrix_2() throws Exception {
        final int[][] matrix = {
                {0, 1, 2, 3},
                {4, 5, 6, 7},
                {8, 9, 10, 11},
                {12, 13, 14, 15}
        };

        final int[][] result = solution.rotateMatrix(matrix);

        final int[][] expectedResult = {
                {12, 8, 4, 0},
                {13, 9, 5, 1},
                {14, 10, 6, 2},
                {15, 11, 7, 3}
        };
        assertTrue(GridUtils.areIntegerGridsEqual(expectedResult, result));
    }
}