package leetcode.interview_facebook_1.problem_2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void maxSubArrayLen_1() throws Exception {
        final int[] nums = {1, -1, 5, -2, 3};
        final int k = 3;

        final int result = solution.maxSubArrayLen(nums, k);

        assertEquals(4, result);
    }

    @Test
    public void maxSubArrayLen_2() throws Exception {
        final int[] nums = {-2, -1, 2, 1};
        final int k = 1;

        final int result = solution.maxSubArrayLen(nums, k);

        assertEquals(2, result);
    }
}