package leetcode.problem_0078;

import Utilities.java.ListUtils;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Solution_2Test {

    private final Solution_2 solution = new Solution_2();

    @Test
    public void test_1() {
        final int[] nums = {1, 2, 3};
        final List<List<Integer>> subsets = solution.subsets(nums);

        assertEquals(8, subsets.size());
        assertTrue(subsets.contains(ListUtils.createList()));
        assertTrue(subsets.contains(ListUtils.createList(1)));
        assertTrue(subsets.contains(ListUtils.createList(2)));
        assertTrue(subsets.contains(ListUtils.createList(3)));
        assertTrue(subsets.contains(ListUtils.createList(1, 2)));
        assertTrue(subsets.contains(ListUtils.createList(2, 3)));
        assertTrue(subsets.contains(ListUtils.createList(1, 3)));
        assertTrue(subsets.contains(ListUtils.createList(1, 2, 3)));
    }

    @Test
    public void test_2() {
        final int[] nums = {0};
        final List<List<Integer>> subsets = solution.subsets(nums);

        assertEquals(2, subsets.size());
        assertTrue(subsets.contains(ListUtils.createList()));
        assertTrue(subsets.contains(ListUtils.createList(0)));
    }
}