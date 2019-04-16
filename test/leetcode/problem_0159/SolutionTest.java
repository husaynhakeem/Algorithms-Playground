package leetcode.problem_0159;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void lengthOfLongestSubstringTwoDistinct_1() throws Exception {
        final String s = "eceba";

        final int result = solution.lengthOfLongestSubstringTwoDistinct(s);

        assertEquals(3, result);
    }

    @Test
    public void lengthOfLongestSubstringTwoDistinct_2() throws Exception {
        final String s = "ccaabbb";

        final int result = solution.lengthOfLongestSubstringTwoDistinct(s);

        assertEquals(5, result);
    }
}