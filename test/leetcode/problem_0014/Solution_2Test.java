package leetcode.problem_0014;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Solution_2Test {

    private final Solution_2 solution = new Solution_2();

    @Test
    public void longestCommonPrefix_1() throws Exception {
        final String[] strs = {};

        final String result = solution.longestCommonPrefix(strs);

        assertTrue(result.isEmpty());
    }

    @Test
    public void longestCommonPrefix_2() throws Exception {
        final String[] strs = {"flower", "flow", "flight"};

        final String result = solution.longestCommonPrefix(strs);

        assertEquals("fl", result);
    }

    @Test
    public void longestCommonPrefix_3() throws Exception {
        final String[] strs = {"dog", "racecar", "car"};

        final String result = solution.longestCommonPrefix(strs);

        assertTrue(result.isEmpty());
    }
}