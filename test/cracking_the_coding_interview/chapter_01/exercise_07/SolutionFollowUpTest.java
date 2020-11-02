package cracking_the_coding_interview.chapter_01.exercise_07;

import Utilities.java.GridUtils;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class SolutionFollowUpTest {

    private final SolutionFollowUp solution = new SolutionFollowUp();

    @Test
    public void rotateMatrix_1() {
        final int[][] matrix = {
                {1, 2},
                {3, 4}
        };

        solution.rotateMatrix(matrix);

        final int[][] expectedResult = {
                {3, 1},
                {4, 2}
        };
        assertTrue(GridUtils.areIntegerGridsEqual(expectedResult, matrix));
    }

    @Test
    public void rotateMatrix_2() {
        final int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        solution.rotateMatrix(matrix);

        final int[][] expectedResult = {
                {7, 4, 1},
                {8, 5, 2},
                {9, 6, 3}
        };
        assertTrue(GridUtils.areIntegerGridsEqual(expectedResult, matrix));
    }

    @Test
    public void rotateMatrix_3() {
        final int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10,11, 12},
                {13, 14, 15, 16},
        };

        solution.rotateMatrix(matrix);

        final int[][] expectedResult = {
                {13, 9, 5, 1},
                {14, 10, 6, 2},
                {15, 11, 7, 3},
                {16, 12, 8, 4},
        };
        assertTrue(GridUtils.areIntegerGridsEqual(expectedResult, matrix));
    }
}