package leetcode.problem_0004;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void test_1() {
        final int[] nums1 = {1, 3};
        final int[] nums2 = {2};

        final double median = solution.findMedianSortedArrays(nums1, nums2);

        assertEquals(2.0, median, 0);
    }

    @Test
    public void test_2() {
        final int[] nums1 = {1, 2};
        final int[] nums2 = {3, 4};

        final double median = solution.findMedianSortedArrays(nums1, nums2);

        assertEquals(2.5, median, 0);
    }

    @Test
    public void test_3() {
        final int[] nums1 = {0, 0};
        final int[] nums2 = {0, 0};

        final double median = solution.findMedianSortedArrays(nums1, nums2);

        assertEquals(0, median, 0);
    }

    @Test
    public void test_4() {
        final int[] nums1 = {};
        final int[] nums2 = {1};

        final double median = solution.findMedianSortedArrays(nums1, nums2);

        assertEquals(1, median, 0);
    }

    @Test
    public void test_5() {
        final int[] nums1 = {2};
        final int[] nums2 = {};

        final double median = solution.findMedianSortedArrays(nums1, nums2);

        assertEquals(2, median, 0);
    }

    @Test
    public void test_6() {
        final int[] nums1 = {};
        final int[] nums2 = {2, 3};

        final double median = solution.findMedianSortedArrays(nums1, nums2);

        assertEquals(2.5, median, 0);
    }
}