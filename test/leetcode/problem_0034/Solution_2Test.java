package leetcode.problem_0034;

import org.junit.Test;

import static Utilities.java.ArrayUtils.areArraysEqual;
import static org.junit.Assert.assertTrue;

public class Solution_2Test {

    private final Solution_2 solution = new Solution_2();

    @Test
    public void test_1() {
        final int[] array = {5, 7, 7, 8, 8, 10};
        final int target = 6;

        final int[] result = solution.searchRange(array, target);

        final int[] expected = {-1, -1};
        assertTrue(areArraysEqual(expected, result));
    }

    @Test
    public void test_2() {
        final int[] array = {5, 7, 7, 8, 8, 10};
        final int target = 8;

        final int[] result = solution.searchRange(array, target);

        final int[] expected = {3, 4};
        assertTrue(areArraysEqual(expected, result));
    }
}