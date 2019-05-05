package leetcode.interview_google_7.problem_1;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void isIsomorphic_1() throws Exception {
        final String s = "egg";
        final String t = "add";

        final boolean result = solution.isIsomorphic(s, t);

        assertTrue(result);
    }

    @Test
    public void isIsomorphic_2() throws Exception {
        final String s = "foo";
        final String t = "bar";

        final boolean result = solution.isIsomorphic(s, t);

        assertFalse(result);
    }

    @Test
    public void isIsomorphic_3() throws Exception {
        final String s = "paper";
        final String t = "title";

        final boolean result = solution.isIsomorphic(s, t);

        assertTrue(result);
    }
}