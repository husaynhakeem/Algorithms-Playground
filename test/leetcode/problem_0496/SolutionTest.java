package leetcode.problem_0496;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void nextGreaterElement_1() throws Exception {
        final int[] nums1 = {2, 4};
        final int[] nums2 = {1, 2, 3, 4};

        final int[] result = solution.nextGreaterElement(nums1, nums2);

        assertArrayEquals(new int[]{3, -1}, result);
    }

    @Test
    public void nextGreaterElement_2() throws Exception {
        final int[] nums1 = {4, 1, 2};
        final int[] nums2 = {1, 3, 4, 2};

        final int[] result = solution.nextGreaterElement(nums1, nums2);

        assertArrayEquals(new int[]{-1, 3, -1}, result);
    }
}