package leetcode.problem_0832;

import Utilities.java.ArrayUtils;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Solution_1Test {

    private final Solution_1 solution = new Solution_1();

    @Test
    public void flipAndInvertImage_1() throws Exception {
        final int[][] A = {
                {1, 1, 0},
                {1, 0, 1},
                {0, 0, 0}
        };

        final int[][] result = solution.flipAndInvertImage(A);

        assertEquals(3, result.length);
        assertTrue(ArrayUtils.areArraysEqual(new int[]{1, 0, 0}, result[0]));
        assertTrue(ArrayUtils.areArraysEqual(new int[]{0, 1, 0}, result[1]));
        assertTrue(ArrayUtils.areArraysEqual(new int[]{1, 1, 1}, result[2]));
    }

    @Test
    public void flipAndInvertImage_2() throws Exception {
        final int[][] A = {
                {1, 1, 0, 0},
                {1, 0, 0, 1},
                {0, 1, 1, 1},
                {1, 0, 1, 0}
        };

        final int[][] result = solution.flipAndInvertImage(A);

        assertEquals(4, result.length);
        assertTrue(ArrayUtils.areArraysEqual(new int[]{1, 1, 0, 0}, result[0]));
        assertTrue(ArrayUtils.areArraysEqual(new int[]{0, 1, 1, 0}, result[1]));
        assertTrue(ArrayUtils.areArraysEqual(new int[]{0, 0, 0, 1}, result[2]));
        assertTrue(ArrayUtils.areArraysEqual(new int[]{1, 0, 1, 0}, result[3]));
    }
}