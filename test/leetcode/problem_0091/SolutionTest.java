package leetcode.problem_0091;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void numDecodings_1() throws Exception {
        final String s = "";

        final int result = solution.numDecodings(s);

        assertEquals(0, result);
    }

    @Test
    public void numDecodings_2() throws Exception {
        final String s = "0";

        final int result = solution.numDecodings(s);

        assertEquals(0, result);
    }

    @Test
    public void numDecodings_3() throws Exception {
        final String s = "7";

        final int result = solution.numDecodings(s);

        assertEquals(1, result);
    }

    @Test
    public void numDecodings_4() throws Exception {
        final String s = "12";

        final int result = solution.numDecodings(s);

        assertEquals(2, result);
    }

    @Test
    public void numDecodings_5() throws Exception {
        final String s = "206";

        final int result = solution.numDecodings(s);

        assertEquals(1, result);
    }

    @Test
    public void numDecodings_6() throws Exception {
        final String s = "10";

        final int result = solution.numDecodings(s);

        assertEquals(1, result);
    }

    @Test
    public void numDecodings_7() throws Exception {
        final String s = "27";

        final int result = solution.numDecodings(s);

        assertEquals(1, result);
    }
}