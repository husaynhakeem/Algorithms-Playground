package leetcode.interview_google_4.problem_1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void licenseKeyFormatting_1() throws Exception {
        final String s = "5F3Z-2e-9-w";
        final int k = 4;

        final String result = solution.licenseKeyFormatting(s, k);

        assertEquals("5F3Z-2E9W", result);
    }

    @Test
    public void licenseKeyFormatting_2() throws Exception {
        final String s = "2-5g-3-J";
        final int k = 2;

        final String result = solution.licenseKeyFormatting(s, k);

        assertEquals("2-5G-3J", result);
    }
}