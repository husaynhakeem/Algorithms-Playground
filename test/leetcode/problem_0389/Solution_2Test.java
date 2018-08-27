package leetcode.problem_0389;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution_2Test {

    private final Solution_2 solution = new Solution_2();

    @Test
    public void findTheDifference_1() throws Exception {
        final String s = "abcd";
        final String t = "abcde";

        final char result = solution.findTheDifference(s, t);

        assertEquals('e', result);
    }

    @Test
    public void findTheDifference_2() throws Exception {
        final String s = "abbbcde";
        final String t = "bzbdcabe";

        final char result = solution.findTheDifference(s, t);

        assertEquals('z', result);
    }
}