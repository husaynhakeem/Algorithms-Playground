package leetcode.problem_0340;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void lengthOfLongestSubstringKDistinct_1() throws Exception {
        final String s = "eceba";
        final int k = 2;

        final int result = solution.lengthOfLongestSubstringKDistinct(s, k);

        assertEquals(3, result);
    }

    @Test
    public void lengthOfLongestSubstringKDistinct_2() throws Exception {
        final String s = "aa";
        final int k = 1;

        final int result = solution.lengthOfLongestSubstringKDistinct(s, k);

        assertEquals(2, result);
    }
}