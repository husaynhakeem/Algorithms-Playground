package leetcode.problem_0010;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Solution_2Test {

    private final Solution_2 solution = new Solution_2();

    @Test
    public void test_1() {
        final String word = "aa";
        final String pattern = "a";

        final boolean isMatch = solution.isMatch(word, pattern);
        assertFalse(isMatch);
    }

    @Test
    public void test_2() {
        final String word = "aa";
        final String pattern = "a*";

        final boolean isMatch = solution.isMatch(word, pattern);
        assertTrue(isMatch);
    }

    @Test
    public void test_3() {
        final String word = "ab";
        final String pattern = ".*";

        final boolean isMatch = solution.isMatch(word, pattern);
        assertTrue(isMatch);
    }

    @Test
    public void test_4() {
        final String word = "aab";
        final String pattern = "c*a*b";

        final boolean isMatch = solution.isMatch(word, pattern);
        assertTrue(isMatch);
    }

    @Test
    public void test_5() {
        final String word = "mississippi";
        final String pattern = "mis*is*p*.";

        final boolean isMatch = solution.isMatch(word, pattern);
        assertFalse(isMatch);
    }

    @Test
    public void test_6() {
        final String word = "ab";
        final String pattern = ".*c";

        final boolean isMatch = solution.isMatch(word, pattern);
        assertFalse(isMatch);
    }
}