package leetcode.problem_0034;

import junit.framework.TestCase;

import static Utilities.java.ArrayUtils.areArraysEqual;

public class SolutionTest extends TestCase {

    private final Solution solution = new Solution();

    public void test_1() {
        final int[] array = {5, 7, 7, 8, 8, 10};
        final int target = 6;

        final int[] result = solution.searchRange(array, target);

        final int[] expected = {-1, -1};
        assertTrue(areArraysEqual(expected, result));
    }

    public void test_2() {
        final int[] array = {5, 7, 7, 8, 8, 10};
        final int target = 8;

        final int[] result = solution.searchRange(array, target);

        final int[] expected = {3, 4};
        assertTrue(areArraysEqual(expected, result));
    }
}