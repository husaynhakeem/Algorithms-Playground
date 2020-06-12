package leetcode.problem_0012;

import junit.framework.TestCase;

public class SolutionTest extends TestCase {

    private final Solution solution = new Solution();

    public void test_1() {
        final int num = 0;

        final String s = solution.intToRoman(num);
        assertEquals("", s);
    }

    public void test_2() {
        final int num = 3;

        final String s = solution.intToRoman(num);
        assertEquals("III", s);
    }

    public void test_3() {
        final int num = 4;

        final String s = solution.intToRoman(num);
        assertEquals("IV", s);
    }

    public void test_4() {
        final int num = 9;

        final String s = solution.intToRoman(num);
        assertEquals("IX", s);
    }

    public void test_5() {
        final int num = 58;

        final String s = solution.intToRoman(num);
        assertEquals("LVIII", s);
    }

    public void test_6() {
        final int num = 1994;

        final String s = solution.intToRoman(num);
        assertEquals("MCMXCIV", s);
    }
}