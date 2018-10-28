package leetcode.problem_0215;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution_1Test {

    private final Solution_1 solution = new Solution_1();

    @Test
    public void findKthLargest_1() throws Exception {
        final int[] array = {1};
        final int k = 1;

        final int result = solution.findKthLargest(array, k);

        assertEquals(1, result);
    }

    @Test
    public void findKthLargest_2() throws Exception {
        final int[] array = {3, 2, 1, 5, 6, 4};
        final int k = 2;

        final int result = solution.findKthLargest(array, k);

        assertEquals(5, result);
    }

    @Test
    public void findKthLargest_3() throws Exception {
        final int[] array = {3, 2, 3, 1, 2, 4, 5, 5, 6};
        final int k = 4;

        final int result = solution.findKthLargest(array, k);

        assertEquals(4, result);
    }
}