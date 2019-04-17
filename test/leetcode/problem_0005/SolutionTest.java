package leetcode.problem_0005;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void longestPalindrome_1() {
        final String s = null;

        final String result = solution.longestPalindrome(s);

        assertNull(result);
    }

    @Test
    public void longestPalindrome_2() {
        final String s = "";

        final String result = solution.longestPalindrome(s);

        assertEquals("", result);
    }

    @Test
    public void longestPalindrome_3() {
        final String s = "babad";

        final String result = solution.longestPalindrome(s);

        assertTrue(result.equals("aba") || result.equals("bab"));
    }

    @Test
    public void longestPalindrome_4() {
        final String s = "cbbd";

        final String result = solution.longestPalindrome(s);

        assertEquals("bb", result);
    }
}