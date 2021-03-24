package leetcode.problem_0040;

import Utilities.java.ListUtils;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void test_1() {
        int[] candidates = {10, 1, 2, 7, 6, 1, 5};
        int target = 8;

        List<List<Integer>> combinations = solution.combinationSum(candidates, target);

        assertEquals(4, combinations.size());
        assertTrue(combinations.contains(ListUtils.createList(1, 1, 6)));
        assertTrue(combinations.contains(ListUtils.createList(1, 2, 5)));
        assertTrue(combinations.contains(ListUtils.createList(1, 7)));
        assertTrue(combinations.contains(ListUtils.createList(2, 6)));
    }

    @Test
    public void test_2() {
        int[] candidates = {2, 5, 2, 1, 2};
        int target = 5;

        List<List<Integer>> combinations = solution.combinationSum(candidates, target);

        assertEquals(2, combinations.size());
        assertTrue(combinations.contains(ListUtils.createList(1, 2, 2)));
        assertTrue(combinations.contains(ListUtils.createList(5)));
    }
}