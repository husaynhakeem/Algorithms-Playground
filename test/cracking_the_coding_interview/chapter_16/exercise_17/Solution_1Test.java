package cracking_the_coding_interview.chapter_16.exercise_17;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution_1Test {

    private final Solution_1 solution = new Solution_1();

    @Test
    public void contiguousSequence_1() throws Exception {
        final int[] array = {};

        final int result = solution.contiguousSequence(array);

        assertEquals(Integer.MIN_VALUE, result);
    }

    @Test
    public void contiguousSequence_2() throws Exception {
        final int[] array = {2};

        final int result = solution.contiguousSequence(array);

        assertEquals(2, result);
    }

    @Test
    public void contiguousSequence_3() throws Exception {
        final int[] array = {2, -8, 3, -2, 4, -10};

        final int result = solution.contiguousSequence(array);

        assertEquals(5, result);
    }

    @Test
    public void contiguousSequence_4() throws Exception {
        final int length = 100;
        final int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = i;
        }

        final int result = solution.contiguousSequence(array);

        assertEquals((length - 1) * length / 2, result);
    }

    @Test
    public void contiguousSequence_5() throws Exception {
        final int length = 10_000;
        final int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = i;
        }

        final int result = solution.contiguousSequence(array);

        assertEquals((length - 1) * length / 2, result);
    }
}