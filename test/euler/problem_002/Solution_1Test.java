package euler.problem_002;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution_1Test {

    private final Solution_1 solution = new Solution_1();

    @Test
    public void sumOfEvenValuedFibonacciValuesSmallerThan() throws Exception {
        final int n = 4_000_000;

        final int result = solution.sumOfEvenValuedFibonacciValuesSmallerThan(n);

        assertEquals(4_613_732, result);
    }
}