package mit_course_6006.lecture_07.counting_sort_2;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void sort_1() throws Exception {
        final int[] array = null;

        final int[] result = solution.sort(array);

        assertNull(result);
    }

    @Test
    public void sort_2() throws Exception {
        final int[] array = {};

        final int[] result = solution.sort(array);

        assertEquals(0, result.length);
    }

    @Test
    public void sort_3() throws Exception {
        final int[] array = {4, 3, 2, 1, 0};

        final int[] result = solution.sort(array);

        assertEquals(5, result.length);
        assertEquals(0, result[0]);
        assertEquals(1, result[1]);
        assertEquals(2, result[2]);
        assertEquals(3, result[3]);
        assertEquals(4, result[4]);
    }

    @Test
    public void sort_4() throws Exception {
        final int[] array = {4, 6, 3, 7, 8, 1};

        final int[] result = solution.sort(array);

        assertEquals(6, result.length);
        assertEquals(1, result[0]);
        assertEquals(3, result[1]);
        assertEquals(4, result[2]);
        assertEquals(6, result[3]);
        assertEquals(7, result[4]);
        assertEquals(8, result[5]);
    }
}