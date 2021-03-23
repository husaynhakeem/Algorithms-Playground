package leetcode.problem_0039;

import Utilities.java.ListUtils;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void test_1() {
        int[] candidates = {2, 3, 6, 7};
        int target = 7;

        List<List<Integer>> combinations = solution.combinationSum(candidates, target);

        assertEquals(2, combinations.size());
        assertTrue(combinations.contains(ListUtils.createList(2, 2, 3)));
        assertTrue(combinations.contains(ListUtils.createList(7)));
    }

    @Test
    public void test_2() {
        int[] candidates = {2, 3, 5};
        int target = 8;

        List<List<Integer>> combinations = solution.combinationSum(candidates, target);

        assertEquals(3, combinations.size());
        assertTrue(combinations.contains(ListUtils.createList(2, 2, 2, 2)));
        assertTrue(combinations.contains(ListUtils.createList(2, 3, 3)));
        assertTrue(combinations.contains(ListUtils.createList(3, 5)));
    }

    @Test
    public void test_3() {
        int[] candidates = {2};
        int target = 1;

        List<List<Integer>> combinations = solution.combinationSum(candidates, target);

        assertTrue(combinations.isEmpty());
    }

    @Test
    public void test_4() {
        int[] candidates = {1};
        int target = 1;

        List<List<Integer>> combinations = solution.combinationSum(candidates, target);

        assertEquals(1, combinations.size());
        assertTrue(combinations.contains(ListUtils.createList(1)));
    }

    @Test

    public void test_5() {
        int[] candidates = {1};
        int target = 2;

        List<List<Integer>> combinations = solution.combinationSum(candidates, target);

        assertEquals(1, combinations.size());
        assertTrue(combinations.contains(ListUtils.createList(1, 1)));
    }
}