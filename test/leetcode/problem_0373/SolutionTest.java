package leetcode.problem_0373;

import Utilities.java.ListUtils;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void kSmallestPairs_1() throws Exception {
        final int[] nums1 = {3, 5, 7, 9};
        final int[] nums2 = {};
        final int k = 1;

        final List<int[]> result = solution.kSmallestPairs(nums1, nums2, k);

        final List<int[]> expected = ListUtils.createList();
        assertTrue(ListUtils.areEqual(expected, result));
    }

    @Test
    public void kSmallestPairs_2() throws Exception {
        final int[] nums1 = {1, 1, 2};
        final int[] nums2 = {1, 2, 3};
        final int k = 10;

        final List<int[]> result = solution.kSmallestPairs(nums1, nums2, k);

        final List<int[]> expected = ListUtils.createList(new int[]{1, 1}, new int[]{1, 1}, new int[]{1, 2}, new int[]{1, 2}, new int[]{2, 1}, new int[]{1, 3}, new int[]{1, 3}, new int[]{2, 2}, new int[]{2, 3});
        assertEquals(expected.size(), result.size());
        for (int i = 0; i < expected.size(); i++) {
            assertArrayEquals(expected.get(i), result.get(i));
        }
    }

    @Test
    public void kSmallestPairs_3() throws Exception {
        final int[] nums1 = {1, 7, 11};
        final int[] nums2 = {2, 4, 6};
        final int k = 3;

        final List<int[]> result = solution.kSmallestPairs(nums1, nums2, k);

        final List<int[]> expected = ListUtils.createList(new int[]{1, 2}, new int[]{1, 4}, new int[]{1, 6});
        assertEquals(expected.size(), result.size());
        for (int i = 0; i < expected.size(); i++) {
            assertArrayEquals(expected.get(i), result.get(i));
        }
    }

    @Test
    public void kSmallestPairs_4() throws Exception {
        final int[] nums1 = {1, 1, 2};
        final int[] nums2 = {1, 2, 3};
        final int k = 2;

        final List<int[]> result = solution.kSmallestPairs(nums1, nums2, k);

        final List<int[]> expected = ListUtils.createList(new int[]{1, 1}, new int[]{1, 1});
        assertEquals(expected.size(), result.size());
        for (int i = 0; i < expected.size(); i++) {
            assertArrayEquals(expected.get(i), result.get(i));
        }
    }

    @Test
    public void kSmallestPairs_5() throws Exception {
        final int[] nums1 = {1, 2};
        final int[] nums2 = {3};
        final int k = 3;

        final List<int[]> result = solution.kSmallestPairs(nums1, nums2, k);

        final List<int[]> expected = ListUtils.createList(new int[]{1, 3}, new int[]{2, 3});
        assertEquals(expected.size(), result.size());
        for (int i = 0; i < expected.size(); i++) {
            assertArrayEquals(expected.get(i), result.get(i));
        }
    }
}