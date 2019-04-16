package leetcode.problem_0076;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void minWindow_1() throws Exception {
        final String s = "ADOBECODEBANC";
        final String t = "ABC";

        final String result = solution.minWindow(s, t);

        assertEquals("BANC", result);
    }

    @Test
    public void minWindow_2() throws Exception {
        final String s = "ADOBECODEBANC";
        final String t = "ABCD";

        final String result = solution.minWindow(s, t);

        assertEquals("ADOBEC", result);
    }
}