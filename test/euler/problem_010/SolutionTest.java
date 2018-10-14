package euler.problem_010;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void summationOfPrimes_1() throws Exception {
        final int n = 10;

        final long result = solution.summationOfPrimes(n);

        assertEquals(17, result);
    }

    @Test
    public void summationOfPrimes_2() throws Exception {
        final int n = 2_000_000;

        final long result = solution.summationOfPrimes(n);

        assertEquals(142_913_828_922L, result);
    }
}