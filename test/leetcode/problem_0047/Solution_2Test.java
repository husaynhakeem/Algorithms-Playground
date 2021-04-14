package leetcode.problem_0047;

import Utilities.java.ListUtils;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class Solution_2Test {

    private final Solution_2 solution = new Solution_2();

    @Test
    public void test_1() {
        final int[] nums = {1, 1, 2};

        final List<List<Integer>> result = solution.permuteUnique(nums);

        final List<List<Integer>> expected = ListUtils.createList(
                ListUtils.createList(1, 1, 2),
                ListUtils.createList(1, 2, 1),
                ListUtils.createList(2, 1, 1)
        );
        assertEquals(expected, result);
    }

    @Test
    public void test_2() {
        final int[] nums = {1, 2, 3};

        final List<List<Integer>> result = solution.permuteUnique(nums);

        final List<List<Integer>> expected = ListUtils.createList(
                ListUtils.createList(1, 2, 3),
                ListUtils.createList(1, 3, 2),
                ListUtils.createList(2, 1, 3),
                ListUtils.createList(2, 3, 1),
                ListUtils.createList(3, 1, 2),
                ListUtils.createList(3, 2, 1)
        );
        assertEquals(expected, result);
    }
}