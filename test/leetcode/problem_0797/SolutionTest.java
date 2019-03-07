package leetcode.problem_0797;

import org.junit.Test;

import java.util.List;

import static Utilities.java.ListUtils.areEqual;
import static Utilities.java.ListUtils.createList;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void allPathsSourceTarget_1() throws Exception {
        final int[][] graph = {{1, 2}, {3}, {3}, {}};

        final List<List<Integer>> result = solution.allPathsSourceTarget(graph);

        assertEquals(2, result.size());
        assertTrue(areEqual(createList(0, 1, 3), result.get(0)));
        assertTrue(areEqual(createList(0, 2, 3), result.get(1)));
    }

    @Test
    public void allPathsSourceTarget_2() throws Exception {
        final int[][] graph = {{1, 2}, {3}, {3, 4}, {4}, {}};

        final List<List<Integer>> result = solution.allPathsSourceTarget(graph);

        assertEquals(3, result.size());
        assertTrue(areEqual(createList(0, 1, 3, 4), result.get(0)));
        assertTrue(areEqual(createList(0, 2, 3, 4), result.get(1)));
        assertTrue(areEqual(createList(0, 2, 4), result.get(2)));
    }
}