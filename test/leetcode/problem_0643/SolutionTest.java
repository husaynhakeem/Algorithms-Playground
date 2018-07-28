package leetcode.problem_0643;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void findMaxAverage_1() throws Exception {
        final int[] array = {1, 12, -5, -6, 50, 3};
        final int k = 4;

        final double result = solution.findMaxAverage(array, k);

        assertEquals(12.75, result, 0);
    }

    @Test
    public void findMaxAverage_2() throws Exception {
        final int[] array = null;
        final int k = 4;

        final double result = solution.findMaxAverage(array, k);

        assertEquals(0, result, 0);
    }

    @Test
    public void findMaxAverage_3() throws Exception {
        final int[] array = {1, 12, -5};
        final int k = 4;

        final double result = solution.findMaxAverage(array, k);

        assertEquals(0, result, 0);
    }
}