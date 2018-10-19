package cracking_the_coding_interview.chapter_16.exercise_19;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Solution_1Test {

    private final Solution_1 solution = new Solution_1();

    @Test
    public void poundSize_1() throws Exception {
        final int[][] land = {
                {0, 2, 1, 0},
                {0, 1, 0, 1},
                {1, 1, 0, 1},
                {0, 1, 0, 1}
        };

        final List<Integer> result = solution.poundSize(land);

        assertEquals(3, result.size());
        assertTrue(result.contains(1));
        assertTrue(result.contains(2));
        assertTrue(result.contains(4));
    }

    @Test
    public void poundSize_2() throws Exception {
        final int[][] land = {
                {0, 2, 1, 0, 0, 2},
                {0, 1, 0, 1, 1, 0},
                {1, 1, 0, 1, 1, 0},
                {0, 1, 0, 1, 0, 2}
        };

        final List<Integer> result = solution.poundSize(land);

        assertEquals(3, result.size());
        assertTrue(result.contains(1));
        assertTrue(result.contains(2));
        assertTrue(result.contains(8));
    }
}