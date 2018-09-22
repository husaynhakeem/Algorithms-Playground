package cracking_the_coding_interview.chapter_08.exercise_04;

import Utilities.java.ListUtils;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Solution_2Test {

    private final Solution_2 solution = new Solution_2();

    @Test
    public void powerSet_1() throws Exception {
        final List<Integer> list = ListUtils.createList();

        final List<List<Integer>> result = solution.powerSet(list);

        final List<List<Integer>> expectedResult = ListUtils.createList(
                ListUtils.createList()
        );
        assertEquals(1, result.size());
        for (int i = 0; i < result.size(); i++) {
            assertTrue(ListUtils.areEqual(expectedResult.get(i), result.get(i)));
        }
    }

    @Test
    public void powerSet_2() throws Exception {
        final List<Integer> list = ListUtils.createList(1);

        final List<List<Integer>> result = solution.powerSet(list);

        final List<List<Integer>> expectedResult = ListUtils.createList(
                ListUtils.createList(),
                ListUtils.createList(1)
        );
        assertEquals(2, result.size());
        for (int i = 0; i < result.size(); i++) {
            assertTrue(ListUtils.areEqual(expectedResult.get(i), result.get(i)));
        }
    }

    @Test
    public void powerSet_3() throws Exception {
        final List<Integer> list = ListUtils.createList(1, 2);

        final List<List<Integer>> result = solution.powerSet(list);

        final List<List<Integer>> expectedResult = ListUtils.createList(
                ListUtils.createList(),
                ListUtils.createList(1),
                ListUtils.createList(2),
                ListUtils.createList(1, 2)
        );
        assertEquals(4, result.size());
        for (int i = 0; i < result.size(); i++) {
            assertTrue(ListUtils.areEqual(expectedResult.get(i), result.get(i)));
        }
    }

    @Test
    public void powerSet_4() throws Exception {
        final List<Integer> list = ListUtils.createList(1, 2, 3);

        final List<List<Integer>> result = solution.powerSet(list);

        final List<List<Integer>> expectedResult = ListUtils.createList(
                ListUtils.createList(),
                ListUtils.createList(1),
                ListUtils.createList(2),
                ListUtils.createList(1, 2),
                ListUtils.createList(3),
                ListUtils.createList(1, 3),
                ListUtils.createList(2, 3),
                ListUtils.createList(1, 2, 3)
        );
        assertEquals(8, result.size());
        for (int i = 0; i < result.size(); i++) {
            assertTrue(ListUtils.areEqual(expectedResult.get(i), result.get(i)));
        }
    }
}