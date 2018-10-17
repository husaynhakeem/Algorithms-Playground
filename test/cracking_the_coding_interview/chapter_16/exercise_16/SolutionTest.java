package cracking_the_coding_interview.chapter_16.exercise_16;

import kotlin.Pair;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void subSort_1() throws Exception {
        final int[] array = {1, 2, 4, 7, 10, 11, 7, 12, 6, 7, 16, 18, 19};

        final Pair<Integer, Integer> result = solution.subSort(array);

        assertEquals(3, (int) result.getFirst());
        assertEquals(9, (int) result.getSecond());
    }

    @Test
    public void subSort_2() throws Exception {
        final int[] array = {1, 2, 4, 7, 10, 11, 7, 20, 6, 7, 16, 18, 19};

        final Pair<Integer, Integer> result = solution.subSort(array);

        assertEquals(3, (int) result.getFirst());
        assertEquals(12, (int) result.getSecond());
    }

    @Test
    public void subSort_3() throws Exception {
        final int[] array = {1, 2, 4, 7, 10, 11, 0, 12, 6, 7, 16, 18, 19};

        final Pair<Integer, Integer> result = solution.subSort(array);

        assertEquals(0, (int) result.getFirst());
        assertEquals(9, (int) result.getSecond());
    }

    @Test
    public void subSort_4() throws Exception {
        final int[] array = {1, 2, 4, 7, 10, 11, 0, 20, 6, 7, 16, 18, 19};

        final Pair<Integer, Integer> result = solution.subSort(array);

        assertEquals(0, (int) result.getFirst());
        assertEquals(12, (int) result.getSecond());
    }

    @Test
    public void subSort_5() throws Exception {
        final int length = 1_000_000;
        final int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = i;
        }

        final Pair<Integer, Integer> result = solution.subSort(array);

        assertEquals(-1, (int) result.getFirst());
        assertEquals(-1, (int) result.getSecond());
    }
}