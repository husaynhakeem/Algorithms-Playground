package leetcode.problem_0520;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void detectCapitalUse_1() throws Exception {
        final String word = "Google";

        final boolean result = solution.detectCapitalUse(word);

        assertTrue(result);
    }

    @Test
    public void detectCapitalUse_2() throws Exception {
        final String word = "USA";

        final boolean result = solution.detectCapitalUse(word);

        assertTrue(result);
    }

    @Test
    public void detectCapitalUse_3() throws Exception {
        final String word = "leetcode";

        final boolean result = solution.detectCapitalUse(word);

        assertTrue(result);
    }

    @Test
    public void detectCapitalUse_4() throws Exception {
        final String word = "FlaG";

        final boolean result = solution.detectCapitalUse(word);

        assertFalse(result);
    }
}