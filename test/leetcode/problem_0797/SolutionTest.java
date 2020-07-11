package leetcode.problem_0797;

import Utilities.java.ListUtils;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void allPathsSourceTarget_1() {
        final int[][] graph = {{1, 2}, {3}, {3}, {}};

        final List<List<Integer>> result = solution.allPathsSourceTarget(graph);

        final List<List<Integer>> expected = ListUtils.createList(
                ListUtils.createList(0, 1, 3),
                ListUtils.createList(0, 2, 3)
        );
        assertEquals(expected, result);
    }

    @Test
    public void allPathsSourceTarget_2() {
        final int[][] graph = {{1, 2}, {3}, {3, 4}, {4}, {}};

        final List<List<Integer>> result = solution.allPathsSourceTarget(graph);

        final List<List<Integer>> expected = ListUtils.createList(
                ListUtils.createList(0, 1, 3, 4),
                ListUtils.createList(0, 2, 3, 4),
                ListUtils.createList(0, 2, 4)
        );
        assertEquals(expected, result);
    }
}