package big_o_la.week_02.problem_01;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution_2Test {

    private final Solution_2 solution = new Solution_2();

    @Test
    public void fibonacci_1() throws Exception {
        final int n = 0;

        final long result = solution.fibonacci(n);

        assertEquals(0, result);
    }

    @Test
    public void fibonacci_2() throws Exception {
        final int n = 1;

        final long result = solution.fibonacci(n);

        assertEquals(1, result);
    }

    @Test
    public void fibonacci_3() throws Exception {
        final int n = 10;

        final long result = solution.fibonacci(n);

        assertEquals(55, result);
    }

    @Test
    public void fibonacci_4() throws Exception {
        final int n = 20;

        final long result = solution.fibonacci(n);

        assertEquals(6765, result);
    }

    @Test
    public void fibonacci_5() throws Exception {
        final int n = 30;

        final long result = solution.fibonacci(n);

        assertEquals(832_040, result);
    }

    @Test
    public void fibonacci_6() throws Exception {
        final int n = 100;

        final long result = solution.fibonacci(n);

        assertEquals(3_736_710_778_780_434_371L, result);
    }
}