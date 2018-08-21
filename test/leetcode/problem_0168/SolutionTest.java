package leetcode.problem_0168;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void convertToTitle_1() throws Exception {
        final int n = 1;

        final String result = solution.convertToTitle(n);

        assertEquals("A", result);
    }

    @Test
    public void convertToTitle_2() throws Exception {
        final int n = 26;

        final String result = solution.convertToTitle(n);

        assertEquals("Z", result);
    }

    @Test
    public void convertToTitle_3() throws Exception {
        final int n = 27;

        final String result = solution.convertToTitle(n);

        assertEquals("AA", result);
    }

    @Test
    public void convertToTitle_4() throws Exception {
        final int n = 701;

        final String result = solution.convertToTitle(n);

        assertEquals("ZY", result);
    }

    @Test
    public void convertToTitle_5() throws Exception {
        final int n = 702;

        final String result = solution.convertToTitle(n);

        assertEquals("ZZ", result);
    }

    @Test
    public void convertToTitle_6() throws Exception {
        final int n = 703;

        final String result = solution.convertToTitle(n);

        assertEquals("AAA", result);
    }
}