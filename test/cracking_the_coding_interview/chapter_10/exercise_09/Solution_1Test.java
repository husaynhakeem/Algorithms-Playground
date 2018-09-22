package cracking_the_coding_interview.chapter_10.exercise_09;

import cracking_the_coding_interview.chapter_10.exercise_09.Solution_1.MatrixIndex;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution_1Test {

    private final Solution_1 solution = new Solution_1();

    @Test
    public void sortedMatrixSearch_1() throws Exception {
        final int[][] matrix = {};
        final int x = 3;

        final MatrixIndex result = solution.sortedMatrixSearch(matrix, x);

        assertEquals(-1, result.line);
        assertEquals(-1, result.column);
    }

    @Test
    public void sortedMatrixSearch_2() throws Exception {
        final int[][] matrix = {
                {1, 2, 3, 4, 5, 6, 7}
        };
        final int x = 3;

        final MatrixIndex result = solution.sortedMatrixSearch(matrix, x);

        assertEquals(0, result.line);
        assertEquals(2, result.column);
    }

    @Test
    public void sortedMatrixSearch_3() throws Exception {
        final int[][] matrix = {
                {0, 1, 2, 3, 4, 5, 9},
                {2, 5, 8, 19, 29, 36, 18},
                {23, 27, 39, 40, 67, 129, 189},
        };
        final int x = 9;

        final MatrixIndex result = solution.sortedMatrixSearch(matrix, x);

        assertEquals(0, result.line);
        assertEquals(6, result.column);
    }

    @Test
    public void sortedMatrixSearch_4() throws Exception {
        final int[][] matrix = {
                {0, 1, 2, 3, 4, 5, 9},
                {2, 5, 8, 19, 29, 36, 18},
                {23, 27, 39, 40, 67, 129, 189},
        };
        final int x = 190;

        final MatrixIndex result = solution.sortedMatrixSearch(matrix, x);

        assertEquals(-1, result.line);
        assertEquals(-1, result.column);
    }
}