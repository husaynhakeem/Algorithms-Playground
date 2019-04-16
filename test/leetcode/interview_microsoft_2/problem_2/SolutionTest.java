package leetcode.interview_microsoft_2.problem_2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void compareVersion_1() throws Exception {
        final String version1 = "0.1";
        final String version2 = "1.1";

        final int result = solution.compareVersion(version1, version2);

        assertEquals(-1, result);
    }

    @Test
    public void compareVersion_2() throws Exception {
        final String version1 = "1.0.1";
        final String version2 = "1";

        final int result = solution.compareVersion(version1, version2);

        assertEquals(1, result);
    }

    @Test
    public void compareVersion_3() throws Exception {
        final String version1 = "7.5.2.4";
        final String version2 = "7.5.3";

        final int result = solution.compareVersion(version1, version2);

        assertEquals(-1, result);
    }

    @Test
    public void compareVersion_4() throws Exception {
        final String version1 = "1.01";
        final String version2 = "1.001";

        final int result = solution.compareVersion(version1, version2);

        assertEquals(0, result);
    }

    @Test
    public void compareVersion_5() throws Exception {
        final String version1 = "1.0";
        final String version2 = "1.0.0";

        final int result = solution.compareVersion(version1, version2);

        assertEquals(0, result);
    }
}