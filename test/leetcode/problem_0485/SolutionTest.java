package leetcode.problem_0485;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void findMaxConsecutiveOnes_1() throws Exception {
        final int[] nums = {1, 0, 1, 1, 0, 1};

        final int result = solution.findMaxConsecutiveOnes(nums);

        assertEquals(2, result);
    }

    @Test
    public void findMaxConsecutiveOnes_2() throws Exception {
        final int[] nums = {};

        final int result = solution.findMaxConsecutiveOnes(nums);

        assertEquals(0, result);
    }

    @Test
    public void findMaxConsecutiveOnes_3() throws Exception {
        final int[] nums = {1, 1, 0, 1, 1, 1};

        final int result = solution.findMaxConsecutiveOnes(nums);

        assertEquals(3, result);
    }

    @Test
    public void findMaxConsecutiveOnes_4() throws Exception {
        final int[] nums = {1, 1, 1, 0, 0, 1, 0, 0, 1, 1, 0};

        final int result = solution.findMaxConsecutiveOnes(nums);

        assertEquals(3, result);
    }
}