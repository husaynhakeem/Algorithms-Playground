package leetcode.problem_0017;

import junit.framework.TestCase;

import java.util.Arrays;
import java.util.List;

public class SolutionTest extends TestCase {

    final Solution solution = new Solution();

    public void test_1() {
        final String digits = "";

        final List<String> combos = solution.letterCombinations(digits);

        assertTrue(combos.isEmpty());
    }

    public void test_2() {
        final String digits = "9";

        final List<String> combos = solution.letterCombinations(digits);

        final List<String> expected = Arrays.asList("w", "x", "y", "z");
        assertEquals(expected.size(), combos.size());
        assertTrue(combos.containsAll(expected));
    }

    public void test_3() {
        final String digits = "23";

        final List<String> combos = solution.letterCombinations(digits);

        final List<String> expected = Arrays.asList("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf");
        assertEquals(expected.size(), combos.size());
        assertTrue(combos.containsAll(expected));
    }
}