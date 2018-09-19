package cracking_the_coding_interview.chapter_10.exercise_03;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void search_1() throws Exception {
        final int[] array = {26, 27, 34, 1, 3, 5, 6, 7, 8, 23};
        final int x = 5;

        final int result = solution.search(array, x);

        assertEquals(5, result);
    }

    @Test
    public void search_2() throws Exception {
        final int[] array = {1, 3, 5, 6, 7, 8, 23, 26, 27, 34};
        final int x = 5;

        final int result = solution.search(array, x);

        assertEquals(2, result);
    }

    @Test
    public void search_3() throws Exception {
        final int[] array = {26, 27, 34, 1, 3, 5, 6, 7, 8, 23};
        final int x = 2;

        final int result = solution.search(array, x);

        assertEquals(-1, result);
    }
}