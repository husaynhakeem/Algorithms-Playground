package leetcode.problem_0032;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void longestValidParentheses_1() throws Exception {
        final String str = "(()";

        final int result = solution.longestValidParentheses(str);

        assertEquals(2, result);
    }

    @Test
    public void longestValidParentheses_2() throws Exception {
        final String str = ")()())";

        final int result = solution.longestValidParentheses(str);

        assertEquals(4, result);
    }

    @Test
    public void longestValidParentheses_3() throws Exception {
        final String str = "(()((())";

        final int result = solution.longestValidParentheses(str);

        assertEquals(4, result);
    }
}