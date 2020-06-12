package leetcode.problem_0011;

import junit.framework.TestCase;

public class Solution_2Test extends TestCase {

    private final Solution_2 solution = new Solution_2();

    public void test_1() {
        final int[] height = {1};

        final int mostWater = solution.maxArea(height);

        assertEquals(0, mostWater);
    }

    public void test_2() {
        final int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};

        final int mostWater = solution.maxArea(height);

        assertEquals(49, mostWater);
    }
}