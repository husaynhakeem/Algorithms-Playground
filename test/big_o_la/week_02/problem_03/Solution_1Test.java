package big_o_la.week_02.problem_03;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution_1Test {

    private final Solution_1 solution = new Solution_1();

    @Test
    public void robbery_1() throws Exception {
        final int[] array = {6, 7, 1, 3, 8, 2, 4};

        final int result = solution.robbery(array);

        assertEquals(19, result);
    }

    @Test
    public void robbery_2() throws Exception {
        final int[] array = {5, 3, 4, 11, 2};

        final int result = solution.robbery(array);

        assertEquals(16, result);
    }

    @Test
    public void robbery_3() throws Exception {
        final int size = 10_000;
        final int[] array = new int[size + 1];
        for (int i = 0; i < size; i++) {
            array[i] = 1;
        }

        final int result = solution.robbery(array);

        assertEquals(size / 2, result);
    }

    @Test
    public void robbery_4() throws Exception {
        final int size = 10_000;
        final int[] array = new int[size + 2];
        for (int i = 0; i < size + 1; i++) {
            array[i] = 1;
        }

        final int result = solution.robbery(array);

        assertEquals(1 + size / 2, result);
    }
}