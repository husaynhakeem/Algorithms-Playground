package cracking_the_coding_interview.chapter_01.exercise_08;

import Utilities.java.GridUtils;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class Solution_2Test {

    private final Solution_2 solution = new Solution_2();

    @Test
    public void zeroMatrix_1() {
        final int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12},
        };

        solution.zeroMatrix(matrix);

        final int[][] expectedResult = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12},
        };
        assertTrue(GridUtils.areIntegerGridsEqual(expectedResult, matrix));
    }

    @Test
    public void zeroMatrix_2() {
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