package big_o_la.week_02.problem_05;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution_1Test {

    private final Solution_1 solution = new Solution_1();

    @Test
    public void optimalStrategy_1() throws Exception {
        final int[] array = {5, 3, 7, 10};

        final int result = solution.optimalStrategy(array);

        assertEquals(15, result);
    }

    @Test
    public void optimalStrategy_2() throws Exception {
        final int[] array = {8, 15, 3, 7};

        final int result = solution.optimalStrategy(array);

        assertEquals(22, result);
    }
}