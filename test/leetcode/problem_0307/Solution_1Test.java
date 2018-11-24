package leetcode.problem_0307;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution_1Test {

    @Test
    public void rangeSumQuery_1() throws Exception {
        final int[] array = {1, 3, 5};
        final Solution_1 solution = new Solution_1(array);

        assertEquals(9, solution.sumRange(0, 2));
        solution.update(1, 2);
        assertEquals(8, solution.sumRange(0, 2));
    }

    @Test
    public void rangeSumQuery_2() throws Exception {
        final int[] array = {1, 3, 8, 9, 0, 1, 6};
        final Solution_1 solution = new Solution_1(array);

        assertEquals(12, solution.sumRange(0, 2));
        assertEquals(0, solution.sumRange(8, 10));
        solution.update(1, 5);
        assertEquals(14, solution.sumRange(0, 2));
    }
}