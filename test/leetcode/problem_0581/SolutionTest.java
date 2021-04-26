package leetcode.problem_0581;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void test_1() {
        final int[] nums = {2, 6, 4, 8, 10, 9, 15};

        final int result = solution.findUnsortedSubarray(nums);

        assertEquals(5, result);
    }

    @Test
    public void test_2() {
        final int[] nums = {1, 2, 3, 4};

        final int result = solution.findUnsortedSubarray(nums);

        assertEquals(0, result);
    }
}