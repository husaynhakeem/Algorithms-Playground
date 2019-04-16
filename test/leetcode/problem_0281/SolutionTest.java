package leetcode.problem_0281;

import Utilities.java.ListUtils;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void zigzagIterator_1() throws Exception {
        final List<Integer> list1 = ListUtils.createList(1, 2);
        final List<Integer> list2 = ListUtils.createList(3, 4, 5, 6);
        final List<List<Integer>> lists = ListUtils.createList(list1, list2);

        final Solution.ZigzagIterator iterator = new Solution.ZigzagIterator(lists);

        assertTrue(iterator.hasNext());
        assertEquals(1, iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals(3, iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals(2, iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals(4, iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals(5, iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals(6, iterator.next());
        assertFalse(iterator.hasNext());
    }

    @Test
    public void zigzagIterator_2() throws Exception {
        final List<Integer> list1 = ListUtils.createList(1, 2, 3);
        final List<Integer> list2 = ListUtils.createList(4, 5, 6, 7);
        final List<Integer> list3 = ListUtils.createList(8, 9);
        final List<List<Integer>> lists = ListUtils.createList(list1, list2, list3);

        final Solution.ZigzagIterator iterator = new Solution.ZigzagIterator(lists);

        assertTrue(iterator.hasNext());
        assertEquals(1, iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals(4, iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals(8, iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals(2, iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals(5, iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals(9, iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals(3, iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals(6, iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals(7, iterator.next());
        assertFalse(iterator.hasNext());
    }
}