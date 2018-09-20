package cracking_the_coding_interview.chapter_10.exercise_05;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void search_1() throws Exception {
        final String[] array = {"at", "", "", "", "ball", "", "", "car", "", "", "dad", "", ""};
        final String x = "ball";

        final int result = solution.search(array, x);

        assertEquals(4, result);
    }

    @Test
    public void search_2() throws Exception {
        final String[] array = {"at", "", "", "", "ball", "", "", "car", "", "", "dad", "", ""};
        final String x = "pokemon";

        final int result = solution.search(array, x);

        assertEquals(-1, result);
    }

    @Test
    public void search_3() throws Exception {
        final String[] array = {"at", "", "", "", "ball", "", "", "car", "", "", "dad", "", ""};
        final String x = "";

        final int result = solution.search(array, x);

        assertEquals(-1, result);
    }
}