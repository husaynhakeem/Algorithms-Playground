package leetcode.problem_0724;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void pivotIndex_1() throws Exception {
        final int[] nums = {1, 7, 3, 6, 5, 6};

        final int result = solution.pivotIndex(nums);

        assertEquals(3, result);
    }

    @Test
    public void pivotIndex_2() throws Exception {
        final int[] nums = {1, 2, 3};

        final int result = solution.pivotIndex(nums);

        assertEquals(-1, result);
    }
}