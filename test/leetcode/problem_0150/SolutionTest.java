package leetcode.problem_0150;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void evalRPN_1() throws Exception {
        final String[] tokens = {"2", "1", "+", "3", "*"};

        final int result = solution.evalRPN(tokens);

        assertEquals(9, result);
    }

    @Test
    public void evalRPN_2() throws Exception {
        final String[] tokens = {"4", "13", "5", "/", "+"};

        final int result = solution.evalRPN(tokens);

        assertEquals(6, result);
    }

    @Test
    public void evalRPN_3() throws Exception {
        final String[] tokens = {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};

        final int result = solution.evalRPN(tokens);

        assertEquals(22, result);
    }
}