package leetcode.interview_uber_1.problem_3;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void isInterleave_1() {
        final String s1 = "aabcc";
        final String s2 = "dbbca";
        final String s3 = "aadbbcbcac";

        final boolean result = solution.isInterleave(s1, s2, s3);

        assertTrue(result);
    }

    @Test
    public void isInterleave_2() {
        final String s1 = "aabcc";
        final String s2 = "dbbca";
        final String s3 = "aadbbbaccc";

        final boolean result = solution.isInterleave(s1, s2, s3);

        assertFalse(result);
    }
}