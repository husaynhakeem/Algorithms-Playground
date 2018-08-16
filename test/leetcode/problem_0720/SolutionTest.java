package leetcode.problem_0720;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void longestWord_1() throws Exception {
        final String[] words = null;

        final String result = solution.longestWord(words);

        assertEquals("", result);
    }

    @Test
    public void longestWord_2() throws Exception {
        final String[] words = {};

        final String result = solution.longestWord(words);

        assertEquals("", result);
    }

    @Test
    public void longestWord_3() throws Exception {
        final String[] words = {"w", "wo", "wor", "worl", "world"};

        final String result = solution.longestWord(words);

        assertEquals("world", result);
    }

    @Test
    public void longestWord_4() throws Exception {
        final String[] words = {"a", "banana", "app", "appl", "ap", "apply", "apple"};

        final String result = solution.longestWord(words);

        assertEquals("apple", result);
    }
}