package leetcode.problem_0373;

import Utilities.java.ListUtils;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void kSmallestPairs_1() {
        final int[] nums1 = {3, 5, 7, 9};
        final int[] nums2 = {};
        final int k = 1;

        final List<int[]> result = solution.kSmallestPairs(nums1, nums2, k);

        assertTrue(result.isEmpty());
    }

    @Test
    public void kSmallestPairs_2() {
        final int[] nums1 = {1, 1, 2};
        final int[] nums2 = {1, 2, 3};
        final int k = 10;

        final List<int[]> result = solution.kSmallestPairs(nums1, nums2, k);

        final List<int[]> expected = ListUtils.createList(new int[]{1, 1}, new int[]{1, 1}, new int[]{1, 2}, new int[]{1, 2}, new int[]{2, 1}, new int[]{1, 3}, new int[]{1, 3}, new int[]{2, 2}, new int[]{2, 3});
        assertTrue(Arrays.deepEquals(expected.toArray(), result.toArray()));
    }

    @Test
    public void kSmallestPairs_3() {
        final int[] nums1 = {1, 7, 11};
        final int[] nums2 = {2, 4, 6};
        final int k = 3;

        final List<int[]> result = solution.kSmallestPairs(nums1, nums2, k);

        final List<int[]> expected = ListUtils.createList(new int[]{1, 2}, new int[]{1, 4}, new int[]{1, 6});
        assertTrue(Arrays.deepEquals(expected.toArray(), result.toArray()));
    }

    @Test
    public void kSmallestPairs_4() {
        final int[] nums1 = {1, 1, 2};
        final int[] nums2 = {1, 2, 3};
        final int k = 2;

        final List<int[]> result = solution.kSmallestPairs(nums1, nums2, k);

        final List<int[]> expected = ListUtils.createList(new int[]{1, 1}, new int[]{1, 1});
        assertTrue(Arrays.deepEquals(expected.toArray(), result.toArray()));
    }

    @Test
    public void kSmallestPairs_5() {
        final int[] nums1 = {1, 2};
        final int[] nums2 = {3};
        final int k = 3;

        final List<int[]> result = solution.kSmallestPairs(nums1, nums2, k);

        final List<int[]> expected = ListUtils.createList(new int[]{1, 3}, new int[]{2, 3});
        assertTrue(Arrays.deepEquals(expected.toArray(), result.toArray()));
    }
}