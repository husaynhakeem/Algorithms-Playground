package cracking_the_coding_interview.chapter_16.exercise_06;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution_2Test {

    private final Solution_2 solution = new Solution_2();

    @Test
    public void smallestDifference_1() throws Exception {
        final int[] a = {};
        final int[] b = {};

        final int result = solution.smallestDifference(a, b);

        assertEquals(Integer.MAX_VALUE, result);
    }

    @Test
    public void smallestDifference_2() throws Exception {
        final int[] a = {1, 3, 15, 11, 2};
        final int[] b = {23, 127, 235, 19, 8};

        final int result = solution.smallestDifference(a, b);

        assertEquals(3, result);
    }

    @Test
    public void smallestDifference_3() throws Exception {
        final int[] a = {100, 178, 145, 20000, 156, 1892, 1, 256, 1999, 1089237393};
        final int[] b = {178, 26802, 14, 16, 12, 0, 189};

        final int result = solution.smallestDifference(a, b);

        assertEquals(0, result);
    }
}