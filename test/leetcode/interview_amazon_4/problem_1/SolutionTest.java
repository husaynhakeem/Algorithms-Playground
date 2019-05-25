package leetcode.interview_amazon_4.problem_1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void romanToInt_1() throws Exception {
        final String s = "III";

        final int result = solution.romanToInt(s);

        assertEquals(3, result);
    }

    @Test
    public void romanToInt_2() throws Exception {
        final String s = "IV";

        final int result = solution.romanToInt(s);

        assertEquals(4, result);
    }

    @Test
    public void romanToInt_3() throws Exception {
        final String s = "IX";

        final int result = solution.romanToInt(s);

        assertEquals(9, result);
    }

    @Test
    public void romanToInt_4() throws Exception {
        final String s = "LVIII";

        final int result = solution.romanToInt(s);

        assertEquals(58, result);
    }

    @Test
    public void romanToInt_5() throws Exception {
        final String s = "MCMXCIV";

        final int result = solution.romanToInt(s);

        assertEquals(1994, result);
    }
}