package big_o_la.week_03.problem_01;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution_2Test {

    private final Solution_2 solution = new Solution_2();

    @Test
    public void findMaxProfit_1() throws Exception {
        final int[] array = {100, 180, 260, 310, 40, 210, 695};

        final int result = solution.findMaxProfit(array);

        assertEquals(655, result);
    }

    @Test
    public void findMaxProfit_2() throws Exception {
        final int[] array = {400, 300, 50};

        final int result = solution.findMaxProfit(array);

        assertEquals(-100, result);
    }

    @Test
    public void findMaxProfit_3() throws Exception {
        final int[] array = {250, 200};

        final int result = solution.findMaxProfit(array);

        assertEquals(-50, result);
    }

    @Test
    public void findMaxProfit_4() throws Exception {
        final int[] array = {200};

        final int result = solution.findMaxProfit(array);

        assertEquals(-1, result);
    }

    @Test
    public void findMaxProfit_5() throws Exception {
        final int[] array = {};

        final int result = solution.findMaxProfit(array);

        assertEquals(-1, result);
    }
}