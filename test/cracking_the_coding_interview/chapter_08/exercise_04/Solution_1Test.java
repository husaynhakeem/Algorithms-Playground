package cracking_the_coding_interview.chapter_08.exercise_04;

import Utilities.java.ListUtils;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class Solution_1Test {

    private final Solution_1 solution = new Solution_1();

    @Test
    public void powerSet_1() {
        final List<Integer> list = ListUtils.createList();

        final List<List<Integer>> result = solution.powerSet(list);

        final List<List<Integer>> expectedResult = ListUtils.createList(
                ListUtils.createList()
        );
        assertEquals(expectedResult, result);
    }

    @Test
    public void powerSet_2() {
        final List<Integer> list = ListUtils.createList(1);

        final List<List<Integer>> result = solution.powerSet(list);

        final List<List<Integer>> expectedResult = ListUtils.createList(
                ListUtils.createList(),
                ListUtils.createList(1)
        );
        assertEquals(expectedResult, result);
    }

    @Test
    public void powerSet_3() {
        final List<Integer> list = ListUtils.createList(1, 2);

        final List<List<Integer>> result = solution.powerSet(list);

        final List<List<Integer>> expectedResult = ListUtils.createList(
                ListUtils.createList(),
                ListUtils.createList(1),
                ListUtils.createList(2),
                ListUtils.createList(1, 2)
        );
        assertEquals(expectedResult, result);
    }

    @Test
    public void powerSet_4() {
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
        assertEquals(expectedResult, result);
    }
}