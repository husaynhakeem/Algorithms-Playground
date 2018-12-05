package leetcode.problem_0557;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void reverseWords_1() throws Exception {
        final String s = "";

        final String result = solution.reverseWords(s);

        assertEquals("", result);
    }

    @Test
    public void reverseWords_2() throws Exception {
        final String s = "Let's take LeetCode contest";

        final String result = solution.reverseWords(s);

        assertEquals("s'teL ekat edoCteeL tsetnoc", result);
    }
}