package euler.problem_003;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution_1Test {

    private final Solution_1 solution = new Solution_1();

    @Test
    public void largestPrimeFactor_1() throws Exception {
        final long n = 13_195;

        final long result = solution.largestPrimeFactor(n);

        assertEquals(29, result);
    }

    @Test
    public void largestPrimeFactor_2() throws Exception {
        final long n = 600_851_475_143L;

        final long result = solution.largestPrimeFactor(n);

        assertEquals(6857, result);
    }
}