package leetcode.problem_0015;

import Utilities.java.ListUtils;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SolutionWithListsTest {

    private final SolutionWithLists solution = new SolutionWithLists();

    @Test
    public void threeSum_1() {
        final int[] array = {};
        final int k = 2;

        final List<List<Integer>> result = solution.threeSum(array, k);

        assertTrue(result.isEmpty());
    }

    @Test
    public void threeSum_2() {
        final int[] array = {1, 2};
        final int k = 3;

        final List<List<Integer>> result = solution.threeSum(array, k);

        assertTrue(result.isEmpty());
    }

    @Test
    public void threeSum_3() {
        final int[] array = {1, 2, -1};
        final int k = 2;

        final List<List<Integer>> result = solution.threeSum(array, k);

        final List<List<Integer>> expected = ListUtils.createList(
                ListUtils.createList(-1, 1, 2)
        );
        assertEquals(expected, result);
    }

    @Test
    public void threeSum_4() {
        final int[] array = {-1, 0, 1, 2, -1, -4};
        final int k = 0;

        final List<List<Integer>> result = solution.threeSum(array, k);

        final List<List<Integer>> expected = ListUtils.createList(
                ListUtils.createList(-1, -1, 2),
                ListUtils.createList(-1, 0, 1)
        );
        assertEquals(expected, result);
    }

    @Test
    public void threeSum_5() {
        final int[] array = {3, 0, -2, -1, 1, 2};
        final int k = 0;

        final List<List<Integer>> result = solution.threeSum(array, k);

        final List<List<Integer>> expected = ListUtils.createList(
                ListUtils.createList(-2, -1, 3),
                ListUtils.createList(-2, 0, 2),
                ListUtils.createList(-1, 0, 1)
        );
        assertEquals(expected, result);
    }
}