package cracking_the_coding_interview.chapter_03.exercise_04;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution_1Test {

    @Test
    public void testMyQueue() throws Exception {
        final Solution_1<Integer> solution = new Solution_1<>();

        assertTrue(solution.isEmpty());

        solution.add(3);
        assertFalse(solution.isEmpty());
        assertEquals(3, (int) solution.peek());

        solution.add(8);
        assertFalse(solution.isEmpty());
        assertEquals(3, (int) solution.peek());

        solution.add(18);
        solution.add(23);
        solution.add(109);
        assertFalse(solution.isEmpty());
        assertEquals(3, (int) solution.peek());

        assertEquals(3, (int) solution.remove());
        assertEquals(8, (int) solution.remove());
        assertEquals(18, (int) solution.peek());
        assertEquals(18, (int) solution.remove());
        assertEquals(23, (int) solution.remove());
        assertEquals(109, (int) solution.remove());
        assertTrue(solution.isEmpty());
    }
}