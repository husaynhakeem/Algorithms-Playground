package leetcode.problem_0054;

import Utilities.java.ListUtils;
import junit.framework.TestCase;

import java.util.List;

public class SolutionTest extends TestCase {

    private final Solution solution = new Solution();

    public void test_1() {
        final int[][] grid = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        final List<Integer> result = solution.spiralOrder(grid);

        final List<Integer> expected = ListUtils.createList(1, 2, 3, 6, 9, 8, 7, 4, 5);
        assertTrue(ListUtils.areEqual(result, expected));
    }

    public void test_2() {
        final int[][] grid = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        final List<Integer> result = solution.spiralOrder(grid);

        final List<Integer> expected = ListUtils.createList(1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7);
        assertTrue(ListUtils.areEqual(result, expected));
    }

    public void test_3() {
        final int[][] grid = {{1}, {2}, {3}, {4}, {5}, {6}, {7}, {8}, {9}, {10}};

        final List<Integer> result = solution.spiralOrder(grid);

        final List<Integer> expected = ListUtils.createList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertTrue(ListUtils.areEqual(result, expected));
    }

    public void test_4() {
        final int[][] grid = {
                {1, 2},
                {3, 4}
        };

        final List<Integer> result = solution.spiralOrder(grid);

        final List<Integer> expected = ListUtils.createList(1, 2, 4, 3);
        assertTrue(ListUtils.areEqual(result, expected));
    }
}