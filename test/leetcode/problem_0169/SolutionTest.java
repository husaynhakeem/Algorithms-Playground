package leetcode.problem_0169;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void test_1() {
        final int[] nums = {3, 2, 3};

        final int result = solution.majorityElement(nums);

        assertEquals(3, result);
    }

    @Test
    public void test_2() {
        final int[] nums = {2, 2, 1, 1, 1, 2, 2};

        final int result = solution.majorityElement(nums);

        assertEquals(2, result);
    }
}