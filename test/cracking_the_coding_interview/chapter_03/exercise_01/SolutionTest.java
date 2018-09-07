package cracking_the_coding_interview.chapter_03.exercise_01;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void testInitialState() {
        final Solution<Integer> solution = new Solution<>();

        final Integer pop0 = solution.pop(0);
        assertNull(pop0);

        final Integer peek0 = solution.peek(0);
        assertNull(peek0);

        final boolean isEmpty0 = solution.isEmpty(0);
        assertTrue(isEmpty0);


        final Integer pop1 = solution.pop(1);
        assertNull(pop1);

        final Integer peek1 = solution.peek(1);
        assertNull(peek1);

        final boolean isEmpty1 = solution.isEmpty(1);
        assertTrue(isEmpty1);


        final Integer pop2 = solution.pop(2);
        assertNull(pop2);

        final Integer peek2 = solution.peek(2);
        assertNull(peek2);

        final boolean isEmpty2 = solution.isEmpty(2);
        assertTrue(isEmpty2);
    }

    @Test
    public void testAfterPushingOneItem() {
        final Solution<Integer> solution = new Solution<>();

        solution.push(0, 0);
        solution.push(1, 1);
        solution.push(2, 2);


        final Integer peek0 = solution.peek(0);
        assertEquals(0, (int) peek0);

        final boolean isEmpty0 = solution.isEmpty(0);
        assertFalse(isEmpty0);

        final Integer pop0 = solution.pop(0);
        assertEquals(0, (int) pop0);

        final boolean isEmpty00 = solution.isEmpty(0);
        assertTrue(isEmpty00);


        final Integer peek1 = solution.peek(1);
        assertEquals(1, (int) peek1);

        final boolean isEmpty1 = solution.isEmpty(1);
        assertFalse(isEmpty1);

        final Integer pop1 = solution.pop(1);
        assertEquals(1, (int) pop1);

        final boolean isEmpty11 = solution.isEmpty(1);
        assertTrue(isEmpty11);


        final Integer peek2 = solution.peek(2);
        assertEquals(2, (int) peek2);

        final boolean isEmpty2 = solution.isEmpty(2);
        assertFalse(isEmpty2);

        final Integer pop2 = solution.pop(2);
        assertEquals(2, (int) pop2);

        final boolean isEmpty22 = solution.isEmpty(2);
        assertTrue(isEmpty22);
    }
}