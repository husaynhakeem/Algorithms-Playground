package cracking_the_coding_interview.chapter_16.exercise_11;

import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Solution_2Test {

    private final Solution_2 solution = new Solution_2();

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
        for (int i = 10; i <= 20; i++) {
            assertTrue(result.contains(i));
        }
    }

    @Test
    public void divingBoard_5() throws Exception {
        final int k = 100;
        final int shortLength = 1;
        final int longLength = 2;

        final Set<Integer> result = solution.divingBoard(k, shortLength, longLength);

        assertEquals(101, result.size());
        for (int i = 100; i <= 200; i++) {
            assertTrue(result.contains(i));
        }
    }
}