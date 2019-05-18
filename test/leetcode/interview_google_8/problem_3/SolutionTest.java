package leetcode.interview_google_8.problem_3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void decodeString_1() throws Exception {
        final String s = "3[a]2[bc]";

        final String result = solution.decodeString(s);

        assertEquals("aaabcbc", result);
    }

    @Test
    public void decodeString_2() throws Exception {
        final String s = "3[a2[c]]";

        final String result = solution.decodeString(s);

        assertEquals("accaccacc", result);
    }

    @Test
    public void decodeString_3() throws Exception {
        final String s = "2[abc]3[cd]ef";

        final String result = solution.decodeString(s);

        assertEquals("abcabccdcdcdef", result);
    }

    @Test
    public void decodeString_4() throws Exception {
        final String s = "100[leetcode]";

        final String result = solution.decodeString(s);

        assertEquals("leetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcode", result);
    }
}