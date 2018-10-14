package euler.problem_001;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution_1Test {

    private final Solution_1 solution = new Solution_1();

    @Test
    public void sumOfMultiplesOfThreeOrFiveSmallerThan() throws Exception {
        final int n = 1000;

        final int result = solution.sumOfMultiplesOfThreeOrFiveSmallerThan(n);

        assertEquals(233168, result);
    }
}