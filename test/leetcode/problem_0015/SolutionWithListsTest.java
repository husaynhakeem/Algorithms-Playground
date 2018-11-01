package leetcode.problem_0015;

import Utilities.java.ListUtils;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SolutionWithListsTest {

    private final SolutionWithLists solution = new SolutionWithLists();

    @Test
    public void threeSum_1() throws Exception {
        final int[] array = {};
        final int k = 2;

        final List<List<Integer>> result = solution.threeSum(array, k);

        assertTrue(result.isEmpty());
    }

    @Test
    public void threeSum_2() throws Exception {
        final int[] array = {1, 2};
        final int k = 3;

        final List<List<Integer>> result = solution.threeSum(array, k);

        assertTrue(result.isEmpty());
    }

    @Test
    public void threeSum_3() throws Exception {
        final int[] array = {1, 2, -1};
        final int k = 2;

        final List<List<Integer>> result = solution.threeSum(array, k);

        assertEquals(1, result.size());
        assertTrue(ListUtils.areEqual(ListUtils.createList(-1, 1, 2), result.get(0)));
    }

    @Test
    public void threeSum_4() throws Exception {
        final int[] array = {-1, 0, 1, 2, -1, -4};
        final int k = 0;

        final List<List<Integer>> result = solution.threeSum(array, k);

        assertEquals(2, result.size());
        assertTrue(ListUtils.areEqual(ListUtils.createList(-1, -1, 2), result.get(0)));
        assertTrue(ListUtils.areEqual(ListUtils.createList(-1, 0, 1), result.get(1)));
    }

    @Test
    public void threeSum_5() throws Exception {
        final int[] array = {3, 0, -2, -1, 1, 2};
        final int k = 0;

        final List<List<Integer>> result = solution.threeSum(array, k);

        assertEquals(3, result.size());
        assertTrue(ListUtils.areEqual(ListUtils.createList(-2, -1, 3), result.get(0)));
        assertTrue(ListUtils.areEqual(ListUtils.createList(-2, 0, 2), result.get(1)));
        assertTrue(ListUtils.areEqual(ListUtils.createList(-1, 0, 1), result.get(2)));
    }
}