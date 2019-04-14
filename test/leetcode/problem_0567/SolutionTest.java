package leetcode.problem_0567;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void checkInclusion_1() throws Exception {
        final String s1 = "ab";
        final String s2 = "eidbaooo";

        final boolean result = solution.checkInclusion(s1, s2);

        assertTrue(result);
    }

    @Test
    public void checkInclusion_2() throws Exception {
        final String s1 = "ab";
        final String s2 = "eidboaoo";

        final boolean result = solution.checkInclusion(s1, s2);

        assertFalse(result);
    }
}