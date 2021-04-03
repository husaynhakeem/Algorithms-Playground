package leetcode.problem_0204;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void test_1() {
        final int n = 10;
        final int result = solution.countPrimes(n);
        assertEquals(4, result);
    }

    @Test
    public void test_2() {
        final int n = 0;
        final int result = solution.countPrimes(n);
        assertEquals(0, result);
    }

    @Test
    public void test_3() {
        final int n = 2;
        final int result = solution.countPrimes(n);
        assertEquals(0, result);
    }
}