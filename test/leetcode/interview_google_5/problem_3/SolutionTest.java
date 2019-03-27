package leetcode.interview_google_5.problem_3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void wordsTyping_1() throws Exception {
        final String[] words = {"hello", "world"};
        final int rows = 2;
        final int cols = 8;

        final int result = solution.wordsTyping(words, rows, cols);

        assertEquals(1, result);
    }

    @Test
    public void wordsTyping_2() throws Exception {
        final String[] words = {"a", "bcd", "e"};
        final int rows = 3;
        final int cols = 6;

        final int result = solution.wordsTyping(words, rows, cols);

        assertEquals(2, result);
    }

    @Test
    public void wordsTyping_3() throws Exception {
        final String[] words = {"I", "had", "apple", "pie"};
        final int rows = 4;
        final int cols = 5;

        final int result = solution.wordsTyping(words, rows, cols);

        assertEquals(1, result);
    }
}