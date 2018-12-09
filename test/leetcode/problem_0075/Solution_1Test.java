package leetcode.problem_0075;

import Utilities.java.ArrayUtils;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class Solution_1Test {

    private final Solution_1 solution = new Solution_1();

    @Test
    public void sortColors_1() throws Exception {
        final int[] nums = {2, 0, 1, 2, 1, 0};

        solution.sortColors(nums);

        final int[] expectedResult = {0, 0, 1, 1, 2, 2};
        assertTrue(ArrayUtils.areArraysEqual(expectedResult, nums));
    }

    @Test
    public void sortColors_2() throws Exception {
        final int[] nums = {2, 2, 1, 1, 0, 0};

        solution.sortColors(nums);

        final int[] expectedResult = {0, 0, 1, 1, 2, 2};
        assertTrue(ArrayUtils.areArraysEqual(expectedResult, nums));
    }
}