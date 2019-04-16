package leetcode.problem_0318;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void maxProducts_1() throws Exception {
        final String[] words = {"abcw", "baz", "foo", "bar", "xtfn", "abcdef"};

        final int result = solution.maxProduct(words);

        assertEquals(16, result);
    }

    @Test
    public void maxProducts_2() throws Exception {
        final String[] words = {"a", "ab", "abc", "d", "cd", "bcd", "abcd"};

        final int result = solution.maxProduct(words);

        assertEquals(4, result);
    }

    @Test
    public void maxProducts_3() throws Exception {
        final String[] words = {"a", "aa", "aaa", "aaaa"};

        final int result = solution.maxProduct(words);

        assertEquals(0, result);
    }
}