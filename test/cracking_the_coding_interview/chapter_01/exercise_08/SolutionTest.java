package cracking_the_coding_interview.chapter_01.exercise_08;

import Utilities.java.GridUtils;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void zeroMatrix() throws Exception {
        final int[][] matrix = {
                {1, 2, 3, 8},
                {1, 0, 0, 2},
                {1, 2, 3, 8},
        };

        solution.zeroMatrix(matrix);

        final int[][] expectedResult = {
                {1, 0, 0, 8},
                {0, 0, 0, 0},
                {1, 0, 0, 8},
        };
        assertTrue(GridUtils.areIntegerGridsEqual(expectedResult, matrix));
    }
}