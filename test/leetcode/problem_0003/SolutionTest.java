package leetcode.problem_0003;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void lengthOfLongestSubstring_1() throws Exception {
        final String s = "abcabcbb";

        final int result = solution.lengthOfLongestSubstring(s);

        assertEquals(3, result);
    }

    @Test
    public void lengthOfLongestSubstring_2() throws Exception {
        final String s = "bbbbb";

        final int result = solution.lengthOfLongestSubstring(s);

        assertEquals(1, result);
    }

    @Test
    public void lengthOfLongestSubstring_3() throws Exception {
        final String s = "pwwkew";

        final int result = solution.lengthOfLongestSubstring(s);

        assertEquals(3, result);
    }
}