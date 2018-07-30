package mit_course_6006.lecture_03.merge_sort;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void sort_1() throws Exception {
        final int[] array = null;

        solution.sort(array);

        assertNull(array);
    }

    @Test
    public void sort_2() throws Exception {
        final int[] array = {};

        solution.sort(array);

        assertEquals(0, array.length);
    }

    @Test
    public void sort_3() throws Exception {
        final int[] array = {4, 3, 2, 1, 0};

        solution.sort(array);

        assertEquals(5, array.length);
        assertEquals(0, array[0]);
        assertEquals(1, array[1]);
        assertEquals(2, array[2]);
        assertEquals(3, array[3]);
        assertEquals(4, array[4]);
    }

    @Test
    public void sort_4() throws Exception {
        final int[] array = {4, 6, 3, 7, 8, 1};

        solution.sort(array);

        assertEquals(6, array.length);
        assertEquals(1, array[0]);
        assertEquals(3, array[1]);
        assertEquals(4, array[2]);
        assertEquals(6, array[3]);
        assertEquals(7, array[4]);
        assertEquals(8, array[5]);
    }
}