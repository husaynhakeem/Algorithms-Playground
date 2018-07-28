package leetcode.problem_0747;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void dominantIndex_1() throws Exception {
        final int[] array = {0, 0, 0, 1};

        final int result = solution.dominantIndex(array);

        assertEquals(3, result);
    }

    @Test
    public void dominantIndex_2() throws Exception {
        final int[] array = {3, 6, 1, 0};

        final int result = solution.dominantIndex(array);

        assertEquals(1, result);
    }

    @Test
    public void dominantIndex_3() throws Exception {
        final int[] array = {1, 2, 3, 4};

        final int result = solution.dominantIndex(array);

        assertEquals(-1, result);
    }

    @Test
    public void dominantIndex_4() throws Exception {
        final int[] array = {1};

        final int result = solution.dominantIndex(array);

        assertEquals(0, result);
    }

    @Test
    public void dominantIndex_5() throws Exception {
        final int[] array = {};

        final int result = solution.dominantIndex(array);

        assertEquals(-1, result);
    }

    @Test
    public void dominantIndex_6() throws Exception {
        final int[] array = null;

        final int result = solution.dominantIndex(array);

        assertEquals(-1, result);
    }
}