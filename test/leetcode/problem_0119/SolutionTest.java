package leetcode.problem_0119;

import Utilities.java.ListUtils;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void getRow_1() throws Exception {
        final int row = 0;

        final List<Integer> result = solution.getRow(row);

        final List<Integer> list = new ArrayList<>();
        list.add(1);

        assertTrue(ListUtils.areEqual(list, result));
    }

    @Test
    public void getRow_2() throws Exception {
        final int row = 1;

        final List<Integer> result = solution.getRow(row);

        final List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);

        assertTrue(ListUtils.areEqual(list, result));
    }

    @Test
    public void getRow_3() throws Exception {
        final int row = 2;

        final List<Integer> result = solution.getRow(row);

        final List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(1);

        assertTrue(ListUtils.areEqual(list, result));
    }

    @Test
    public void getRow_4() throws Exception {
        final int row = 3;

        final List<Integer> result = solution.getRow(row);

        final List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(3);
        list.add(1);

        assertTrue(ListUtils.areEqual(list, result));
    }

    @Test
    public void getRow_5() throws Exception {
        final int row = 4;

        final List<Integer> result = solution.getRow(row);

        final List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(6);
        list.add(4);
        list.add(1);

        assertTrue(ListUtils.areEqual(list, result));
    }
}