package leetcode.problem_0890;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void findAndReplacePattern() throws Exception {
        final String[] words = {"abc", "deq", "mee", "aqq", "dkd", "ccc"};
        final String pattern = "abb";

        final List<String> result = solution.findAndReplacePattern(words, pattern);

        assertEquals(2, result.size());
        assertTrue(result.contains("mee"));
        assertTrue(result.contains("aqq"));
    }
}