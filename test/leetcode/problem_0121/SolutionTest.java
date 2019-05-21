package leetcode.problem_0121;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void maxProfit_1() throws Exception {
        final int[] prices = {7, 1, 5, 3, 6, 4};

        final int result = solution.maxProfit(prices);

        assertEquals(5, result);
    }

    @Test
    public void maxProfit_2() throws Exception {
        final int[] prices = {7, 6, 4, 3, 1};

        final int result = solution.maxProfit(prices);

        assertEquals(0, result);
    }
}