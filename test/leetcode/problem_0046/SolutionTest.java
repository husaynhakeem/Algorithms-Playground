package leetcode.problem_0046;

import Utilities.java.ListUtils;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void test_1() {
        final int[] nums = {1, 2, 3};

        final List<List<Integer>> permutations = solution.permute(nums);

        assertEquals(6, permutations.size());
        assertTrue(permutations.contains(ListUtils.createList(1, 2, 3)));
        assertTrue(permutations.contains(ListUtils.createList(1, 3, 2)));
        assertTrue(permutations.contains(ListUtils.createList(2, 1, 3)));
        assertTrue(permutations.contains(ListUtils.createList(2, 3, 1)));
        assertTrue(permutations.contains(ListUtils.createList(3, 2, 1)));
        assertTrue(permutations.contains(ListUtils.createList(3, 1, 2)));
    }

    @Test
    public void test_2() {
        final int[] nums = {0, 1};

        final List<List<Integer>> permutations = solution.permute(nums);

        assertEquals(2, permutations.size());
        assertTrue(permutations.contains(ListUtils.createList(0, 1)));
        assertTrue(permutations.contains(ListUtils.createList(1, 0)));
    }

    @Test
    public void test_3() {
        final int[] nums = {1};

        final List<List<Integer>> permutations = solution.permute(nums);

        assertEquals(1, permutations.size());
        assertTrue(permutations.contains(ListUtils.createList(1)));
    }
}