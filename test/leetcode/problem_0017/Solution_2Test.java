package leetcode.problem_0017;

import Utilities.java.ListUtils;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Solution_2Test {

    private final Solution_2 solution = new Solution_2();

    @Test
    public void test_1() {
        final String digits = "";

        final List<String> combos = solution.letterCombinations(digits);

        assertTrue(combos.isEmpty());
    }

    @Test
    public void test_2() {
        final String digits = "9";

        final List<String> result = solution.letterCombinations(digits);

        assertEquals(ListUtils.createList("w", "x", "y", "z"), result);
    }

    @Test
    public void test_3() {
        final String digits = "23";

        final List<String> result = solution.letterCombinations(digits);

        assertEquals(ListUtils.createList("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"), result);
    }
}