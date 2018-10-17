package cracking_the_coding_interview.chapter_16.exercise_11;

import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Solution_1Test {

    private final Solution_1 solution = new Solution_1();

    @Test
    public void divingBoard_1() throws Exception {
        final int k = 1;
        final int shortLength = 1;
        final int longLength = 2;

        final Set<Integer> result = solution.divingBoard(k, shortLength, longLength);

        assertEquals(2, result.size());
        assertTrue(result.contains(1));
        assertTrue(result.contains(2));
    }

    @Test
    public void divingBoard_2() throws Exception {
        final int k = 2;
        final int shortLength = 1;
        final int longLength = 2;

        final Set<Integer> result = solution.divingBoard(k, shortLength, longLength);

        assertEquals(3, result.size());
        assertTrue(result.contains(2));
        assertTrue(result.contains(3));
        assertTrue(result.contains(4));
    }

    @Test
    public void divingBoard_3() throws Exception {
        final int k = 3;
        final int shortLength = 1;
        final int longLength = 2;

        final Set<Integer> result = solution.divingBoard(k, shortLength, longLength);

        assertEquals(4, result.size());
        assertTrue(result.contains(3));
        assertTrue(result.contains(4));
        assertTrue(result.contains(5));
        assertTrue(result.contains(6));
    }

    @Test
    public void divingBoard_4() throws Exception {
        final int k = 10;
        final int shortLength = 1;
        final int longLength = 2;

        final Set<Integer> result = solution.divingBoard(k, shortLength, longLength);

        assertEquals(11, result.size());
        assertTrue(result.contains(10));
        assertTrue(result.contains(11));
        assertTrue(result.contains(12));
        assertTrue(result.contains(13));
        assertTrue(result.contains(14));
        assertTrue(result.contains(15));
        assertTrue(result.contains(16));
        assertTrue(result.contains(17));
        assertTrue(result.contains(18));
        assertTrue(result.contains(19));
        assertTrue(result.contains(20));
    }
}