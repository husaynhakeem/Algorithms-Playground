package leetcode.problem_0041;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void test_1() {
        final int[] nums = {1, 2, 0};
        final int result = solution.firstMissingPositive(nums);

        assertEquals(3, result);
    }

    @Test
    public void test_2() {
        final int[] nums = {3, 4, -1, 1};
        final int result = solution.firstMissingPositive(nums);

        assertEquals(2, result);
    }

    @Test
    public void test_3() {
        final int[] nums = {7, 8, 9, 11, 12};
        final int result = solution.firstMissingPositive(nums);

        assertEquals(1, result);
    }
}