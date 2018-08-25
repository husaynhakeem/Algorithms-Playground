package leetcode.problem_0657;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class solution_2Test {

    private Solution_2 solution = new Solution_2();

    @Test
    public void judgeCircle_1() throws Exception {
        final String moves = "UD";

        final boolean result = solution.judgeCircle(moves);

        assertTrue(result);
    }

    @Test
    public void judgeCircle_2() throws Exception {
        final String moves = "LL";

        final boolean result = solution.judgeCircle(moves);

        assertFalse(result);
    }

    @Test
    public void judgeCircle_3() throws Exception {
        final String moves = "UDLLDURR";

        final boolean result = solution.judgeCircle(moves);

        assertTrue(result);
    }

    @Test
    public void judgeCircle_4() throws Exception {
        final String moves = "RLUURDDDLU";

        final boolean result = solution.judgeCircle(moves);

        assertTrue(result);
    }
}