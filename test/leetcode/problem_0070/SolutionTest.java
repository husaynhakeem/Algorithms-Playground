package leetcode.problem_0070;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void climbStairs_1() throws Exception {
        final int n = 0;

        final int result = solution.climbStairs(n);

        assertEquals(0, result);
    }

    @Test
    public void climbStairs_2() throws Exception {
        final int n = 1;

        final int result = solution.climbStairs(n);

        assertEquals(1, result);
    }

    @Test
    public void climbStairs_3() throws Exception {
        final int n = 2;

        final int result = solution.climbStairs(n);

        assertEquals(2, result);
    }

    @Test
    public void climbStairs_4() throws Exception {
        final int n = 3;

        final int result = solution.climbStairs(n);

        assertEquals(3, result);
    }

    @Test
    public void climbStairs_5() throws Exception {
        final int n = 4;

        final int result = solution.climbStairs(n);

        assertEquals(5, result);
    }

    @Test
    public void climbStairs_6() throws Exception {
        final int n = 10;

        final int result = solution.climbStairs(n);

        assertEquals(89, result);
    }
}