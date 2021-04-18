package leetcode.problem_0349;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void test_1() {
        final int[] nums1 = {1, 2, 2, 1};
        final int[] nums2 = {2, 2};

        final int[] result = solution.intersection(nums1, nums2);

        assertArrayEquals(new int[]{2}, result);
    }

    @Test
    public void test_2() {
        final int[] nums1 = {4, 9, 5};
        final int[] nums2 = {9, 4, 9, 8, 4};

        final int[] result = solution.intersection(nums1, nums2);

        assertArrayEquals(new int[]{9, 4}, result);
    }
}