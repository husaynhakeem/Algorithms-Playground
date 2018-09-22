package cracking_the_coding_interview.chapter_08.exercise_03;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution_Test {

    private final Solution solution = new Solution();

    @Test
    public void magicIndex_1() throws Exception {
        final int[] array = {-40, -20, -1, 1, 2, 3, 5, 7, 9, 12, 13};

        final int result = solution.magicIndex(array);

        assertEquals(7, result);
    }

    @Test
    public void magicIndex_2() throws Exception {
        final int[] array = {-40, -20, -1, 1, 2, 3, 5, 8, 9, 12, 13};

        final int result = solution.magicIndex(array);

        assertEquals(-1, result);
    }

    @Test
    public void magicIndex_3() throws Exception {
        final int[] array = {-40, -20, -1, 1, 2, 3, 5, 6, 8, 12, 13};

        final int result = solution.magicIndex(array);

        assertEquals(8, result);
    }
}