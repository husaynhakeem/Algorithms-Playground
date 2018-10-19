package cracking_the_coding_interview.chapter_16.exercise_21;

import kotlin.Pair;
import org.junit.Test;

import static cracking_the_coding_interview.chapter_16.exercise_21.Solution_1.INVALID_PAIR;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Solution_1Test {

    private final Solution_1 solution = new Solution_1();

    @Test
    public void sumSwap_1() throws Exception {
        final int[] a = {4, 1, 2, 1, 2};
        final int[] b = {3, 6, 3, 3};

        final Pair<Integer, Integer> result = solution.sumSwap(a, b);

        assertEquals(INVALID_PAIR, result);
    }

    @Test
    public void sumSwap_2() throws Exception {
        final int[] a = {4, 1, 2, 1, 1, 2};
        final int[] b = {3, 6, 3, 3};

        final Pair<Integer, Integer> result = solution.sumSwap(a, b);

        assertTrue(result.getFirst() == 1 || result.getFirst() == 3);
        assertTrue(result.getSecond() == 1 || result.getSecond() == 3);
    }

    @Test
    public void sumSwap_3() throws Exception {
        final int[] a = {1, 2, 9, 2, 10, 3, 5, 1, 9};
        final int[] b = {1, 23};

        final Pair<Integer, Integer> result = solution.sumSwap(a, b);

        assertTrue(result.getFirst() == 10 || result.getFirst() == 1);
        assertTrue(result.getSecond() == 10 || result.getSecond() == 1);
    }

    @Test
    public void sumSwap_4() throws Exception {
        final int[] a = {1, 2, 9, 11, 3, 6, 1, 9};
        final int[] b = {1, 23};

        final Pair<Integer, Integer> result = solution.sumSwap(a, b);

        assertEquals(INVALID_PAIR, result);
    }
}