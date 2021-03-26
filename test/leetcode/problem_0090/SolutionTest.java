package leetcode.problem_0090;

import Utilities.java.ListUtils;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void test_1() {
        final int[] nums = {1, 2, 2};
        final List<List<Integer>> subsets = solution.subsetsWithDup(nums);

        assertEquals(6, subsets.size());
        assertTrue(subsets.contains(ListUtils.createList()));
        assertTrue(subsets.contains(ListUtils.createList(1)));
        assertTrue(subsets.contains(ListUtils.createList(1, 2)));
        assertTrue(subsets.contains(ListUtils.createList(1, 2, 2)));
        assertTrue(subsets.contains(ListUtils.createList(2)));
        assertTrue(subsets.contains(ListUtils.createList(2, 2)));
    }

    @Test
    public void test_2() {
        final int[] nums = {4, 4, 4, 1, 4};
        final List<List<Integer>> subsets = solution.subsetsWithDup(nums);

        assertEquals(10, subsets.size());
        assertTrue(subsets.contains(ListUtils.createList()));
        assertTrue(subsets.contains(ListUtils.createList(1)));
        assertTrue(subsets.contains(ListUtils.createList(1, 4)));
        assertTrue(subsets.contains(ListUtils.createList(1, 4, 4)));
        assertTrue(subsets.contains(ListUtils.createList(1, 4, 4, 4)));
        assertTrue(subsets.contains(ListUtils.createList(1, 4, 4, 4, 4)));
        assertTrue(subsets.contains(ListUtils.createList(4)));
        assertTrue(subsets.contains(ListUtils.createList(4, 4)));
        assertTrue(subsets.contains(ListUtils.createList(4, 4, 4)));
        assertTrue(subsets.contains(ListUtils.createList(4, 4, 4, 4)));
    }

    @Test
    public void test_3() {
        final int[] nums = {0};
        final List<List<Integer>> subsets = solution.subsetsWithDup(nums);

        assertEquals(2, subsets.size());
        assertTrue(subsets.contains(ListUtils.createList()));
        assertTrue(subsets.contains(ListUtils.createList(0)));
    }
}