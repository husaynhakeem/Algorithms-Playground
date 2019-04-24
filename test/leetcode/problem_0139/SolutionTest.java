package leetcode.problem_0139;

import Utilities.java.ListUtils;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void wordBreak_1() throws Exception {
        final String word = "leetcode";
        final List<String> dictionary = ListUtils.createList("leet", "code");

        final boolean result = solution.wordBreak(word, dictionary);

        assertTrue(result);
    }

    @Test
    public void wordBreak_2() throws Exception {
        final String word = "applepenapple";
        final List<String> dictionary = ListUtils.createList("apple", "pen");

        final boolean result = solution.wordBreak(word, dictionary);

        assertTrue(result);
    }

    @Test
    public void wordBreak_3() throws Exception {
        final String word = "catsandog";
        final List<String> dictionary = ListUtils.createList("cats", "dog", "sand", "and", "cat");

        final boolean result = solution.wordBreak(word, dictionary);

        assertFalse(result);
    }

    @Test
    public void wordBreak_4() throws Exception {
        final String word = "";
        final List<String> dictionary = ListUtils.createList("leet", "code");

        final boolean result = solution.wordBreak(word, dictionary);

        assertTrue(result);
    }

    @Test
    public void wordBreak_5() throws Exception {
        final String word = "leetcode";
        final List<String> dictionary = ListUtils.createList();

        final boolean result = solution.wordBreak(word, dictionary);

        assertFalse(result);
    }

    @Test
    public void wordBreak_6() throws Exception {
        final String word = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab";
        final List<String> dictionary = ListUtils.createList("a", "aa", "aaa", "aaaa", "aaaaa", "aaaaaa", "aaaaaaa", "aaaaaaaa", "aaaaaaaaa", "aaaaaaaaaa");

        final boolean result = solution.wordBreak(word, dictionary);

        assertFalse(result);
    }
}