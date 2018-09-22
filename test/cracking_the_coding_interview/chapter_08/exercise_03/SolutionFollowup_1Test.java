package cracking_the_coding_interview.chapter_08.exercise_03;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionFollowup_1Test {

    private final SolutionFollowup_1 solution = new SolutionFollowup_1();

    @Test
    public void magicIndex_1() throws Exception {
        final int[] array = {-10, -5, 2, 2, 2, 3, 4, 7, 9, 12, 13};

        final int result = solution.magicIndex(array);

        assertEquals(2, result);
    }

    @Test
    public void magicIndex_2() throws Exception {
        final int[] array = {2, 2, 2, 2};

        final int result = solution.magicIndex(array);

        assertEquals(2, result);
    }

    @Test
    public void magicIndex_3() throws Exception {
        final int[] array = {-40, -20, -1, 1, 2, 3, 5, 7, 9, 12, 13};

        final int result = solution.magicIndex(array);

        assertEquals(7, result);
    }

    @Test
    public void magicIndex_4() throws Exception {
        final int[] array = {-40, -20, -1, 1, 2, 3, 5, 8, 9, 12, 13};

        final int result = solution.magicIndex(array);

        assertEquals(-1, result);
    }

    @Test
    public void magicIndex_5() throws Exception {
        final int[] array = {-40, -20, -1, 1, 2, 3, 5, 6, 8, 12, 13};

        final int result = solution.magicIndex(array);

        assertEquals(8, result);
    }
}