package leetcode.problem_0932;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution_2Test {

    private final Solution_2 solution = new Solution_2();

    @Test
    public void beautifulArray_1() throws Exception {
        final int n = 1;

        final int[] result = solution.beautifulArray(n);

        assertEquals(1, result.length);
        assertEquals(1, result[0]);
    }

    @Test
    public void beautifulArray_2() throws Exception {
        final int n = 2;

        final int[] result = solution.beautifulArray(n);

        assertEquals(2, result.length);
        assertEquals(1, result[0]);
        assertEquals(2, result[1]);
    }

    @Test
    public void beautifulArray_3() throws Exception {
        final int n = 3;

        final int[] result = solution.beautifulArray(n);

        assertEquals(3, result.length);
        assertEquals(1, result[0]);
        assertEquals(3, result[1]);
        assertEquals(2, result[2]);
    }

    @Test
    public void beautifulArray_4() throws Exception {
        final int n = 4;

        final int[] result = solution.beautifulArray(n);

        assertEquals(4, result.length);
        assertEquals(1, result[0]);
        assertEquals(3, result[1]);
        assertEquals(2, result[2]);
        assertEquals(4, result[3]);
    }

    @Test
    public void beautifulArray_5() throws Exception {
        final int n = 5;

        final int[] result = solution.beautifulArray(n);

        assertEquals(5, result.length);
        assertEquals(1, result[0]);
        assertEquals(5, result[1]);
        assertEquals(3, result[2]);
        assertEquals(2, result[3]);
        assertEquals(4, result[4]);
    }

    @Test
    public void beautifulArray_6() throws Exception {
        final int n = 6;

        final int[] result = solution.beautifulArray(n);

        assertEquals(6, result.length);
        assertEquals(1, result[0]);
        assertEquals(5, result[1]);
        assertEquals(3, result[2]);
        assertEquals(2, result[3]);
        assertEquals(6, result[4]);
        assertEquals(4, result[5]);
    }
}