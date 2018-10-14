package euler.problem_007;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void nthPrime_1() throws Exception {
        final int n = 1;

        final int result = solution.nthPrime(n);

        assertEquals(2, result);
    }

    @Test
    public void nthPrime_2() throws Exception {
        final int n = 2;

        final int result = solution.nthPrime(n);

        assertEquals(3, result);
    }

    @Test
    public void nthPrime_3() throws Exception {
        final int n = 3;

        final int result = solution.nthPrime(n);

        assertEquals(5, result);
    }

    @Test
    public void nthPrime_4() throws Exception {
        final int n = 4;

        final int result = solution.nthPrime(n);

        assertEquals(7, result);
    }

    @Test
    public void nthPrime_5() throws Exception {
        final int n = 5;

        final int result = solution.nthPrime(n);

        assertEquals(11, result);
    }

    @Test
    public void nthPrime_6() throws Exception {
        final int n = 6;

        final int result = solution.nthPrime(n);

        assertEquals(13, result);
    }

    @Test
    public void nthPrime_7() throws Exception {
        final int n = 10_001;

        final int result = solution.nthPrime(n);

        assertEquals(104_743, result);
    }
}