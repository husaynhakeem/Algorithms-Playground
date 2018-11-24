package leetcode.problem_0008;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void myAtoi_1() throws Exception {
        final String str = "";

        final int result = solution.myAtoi(str);

        assertEquals(0, result);
    }

    @Test
    public void myAtoi_2() throws Exception {
        final String str = "     ";

        final int result = solution.myAtoi(str);

        assertEquals(0, result);
    }

    @Test
    public void myAtoi_3() throws Exception {
        final String str = "42";

        final int result = solution.myAtoi(str);

        assertEquals(42, result);
    }

    @Test
    public void myAtoi_4() throws Exception {
        final String str = "   -42";

        final int result = solution.myAtoi(str);

        assertEquals(-42, result);
    }

    @Test
    public void myAtoi_5() throws Exception {
        final String str = "4193 with words";

        final int result = solution.myAtoi(str);

        assertEquals(4193, result);
    }

    @Test
    public void myAtoi_6() throws Exception {
        final String str = "words and 987";

        final int result = solution.myAtoi(str);

        assertEquals(0, result);
    }

    @Test
    public void myAtoi_7() throws Exception {
        final String str = "-91283472332";

        final int result = solution.myAtoi(str);

        assertEquals(-2147483648, result);
    }

    @Test
    public void myAtoi_8() throws Exception {
        final String str = "-2147483648";

        final int result = solution.myAtoi(str);

        assertEquals(-2147483648, result);
    }

    @Test
    public void myAtoi_9() throws Exception {
        final String str = "2147483647";

        final int result = solution.myAtoi(str);

        assertEquals(2147483647, result);
    }
}