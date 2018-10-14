package euler.problem_004;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution_1Test {

    private final Solution_1 solution = new Solution_1();

    @Test
    public void largestPalindromeProduct() throws Exception {
        final int n = 1000;

        final int result = solution.largestPalindromeProduct(n);

        assertEquals(906_609, result);
    }
}