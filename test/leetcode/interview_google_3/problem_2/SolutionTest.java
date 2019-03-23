package leetcode.interview_google_3.problem_2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void expressiveWords_1() throws Exception {
        final String s = "heeelllooo";
        final String[] words = {"hello", "hi", "helo"};

        final int result = solution.expressiveWords(s, words);

        assertEquals(2, result);
    }

    @Test
    public void expressiveWords_2() throws Exception {
        final String s = "heeellooo";
        final String[] words = {"hello", "hi", "helo"};

        final int result = solution.expressiveWords(s, words);

        assertEquals(1, result);
    }

    @Test
    public void expressiveWords_3() throws Exception {
        final String s = "aaa";
        final String[] words = {"aaaa"};

        final int result = solution.expressiveWords(s, words);

        assertEquals(0, result);
    }
}