package leetcode.problem_0284;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class SolutionTest {

    @Test
    public void peekingIterator() throws Exception {
        final List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        final Solution.PeekingIterator peekingIterator = new Solution.PeekingIterator(list.iterator());

        assertEquals(1, (int) peekingIterator.next());
        assertEquals(2, (int) peekingIterator.peek());
        assertEquals(2, (int) peekingIterator.next());
        assertEquals(3, (int) peekingIterator.next());
        assertFalse(peekingIterator.hasNext());
    }
}