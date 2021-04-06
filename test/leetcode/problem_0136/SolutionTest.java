package leetcode.problem_0136;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void test_1() {
        final int[] nums = {2, 2, 1};

        final int result = solution.singleNumber(nums);

        assertEquals(1, result);
    }

    @Test
    public void test_2() {
        final int[] nums = {4, 1, 2, 1, 2};

        final int result = solution.singleNumber(nums);

        assertEquals(4, result);
    }

    @Test
    public void test_3() {
        final int[] nums = {1};

        final int result = solution.singleNumber(nums);

        assertEquals(1, result);
    }
}