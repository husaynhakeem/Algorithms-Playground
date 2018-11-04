package leetcode.problem_0016;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution_1Test {

    private final Solution_1 solution = new Solution_1();

    @Test
    public void threeSumClosest_1() throws Exception {
        final int[] array = {-1, 2, 1, -4};
        final int target = 1;

        final int result = solution.threeSumClosest(array, target);

        assertEquals(2, result);
    }

    @Test
    public void threeSumClosest_2() throws Exception {
        final int[] array = {0, 1, 2};
        final int target = 0;

        final int result = solution.threeSumClosest(array, target);

        assertEquals(3, result);
    }

    @Test
    public void threeSumClosest_3() throws Exception {
        final int[] array = {-1, 2, 1, -4};
        final int target = -1;

        final int result = solution.threeSumClosest(array, target);

        assertEquals(-1, result);
    }
}