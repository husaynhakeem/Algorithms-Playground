package leetcode.problem_0784;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void letterCasePermutation_1() throws Exception {
        final String s = "a1b2";

        final List<String> result = solution.letterCasePermutation(s);

        assertEquals(4, result.size());
        assertTrue(result.contains("a1b2"));
        assertTrue(result.contains("a1B2"));
        assertTrue(result.contains("A1b2"));
        assertTrue(result.contains("A1B2"));
    }

    @Test
    public void letterCasePermutation_2() throws Exception {
        final String s = "3z4";

        final List<String> result = solution.letterCasePermutation(s);

        assertEquals(2, result.size());
        assertTrue(result.contains("3z4"));
        assertTrue(result.contains("3Z4"));
    }

    @Test
    public void letterCasePermutation_3() throws Exception {
        final String s = "12345";

        final List<String> result = solution.letterCasePermutation(s);

        assertEquals(1, result.size());
        assertTrue(result.contains("12345"));
    }
}