package leetcode.problem_0119;

import Utilities.java.ListUtils;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void getRow_1() {
        final int row = 0;

        final List<Integer> result = solution.getRow(row);

        final List<Integer> expected = ListUtils.createList(1);
        assertEquals(expected, result);
    }

    @Test
    public void getRow_2() {
        final int row = 1;

        final List<Integer> result = solution.getRow(row);

        final List<Integer> expected = ListUtils.createList(1, 1);
        assertEquals(expected, result);
    }

    @Test
    public void getRow_3() {
        final int row = 2;

        final List<Integer> result = solution.getRow(row);

        final List<Integer> expected = ListUtils.createList(1, 2, 1);
        assertEquals(expected, result);
    }

    @Test
    public void getRow_4() {
        final int row = 3;

        final List<Integer> result = solution.getRow(row);

        final List<Integer> expected = ListUtils.createList(1, 3, 3, 1);
        assertEquals(expected, result);
    }

    @Test
    public void getRow_5() {
        final int row = 4;

        final List<Integer> result = solution.getRow(row);

        final List<Integer> expected = ListUtils.createList(1, 4, 6, 4, 1);
        assertEquals(expected, result);
    }
}