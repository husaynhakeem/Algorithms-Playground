package leetcode.problem_0921;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution_1Test {

    private Solution_1 solution = new Solution_1();

    @Test
    public void minAddToMakeValid_1() throws Exception {
        final String s = "())";

        final int result = solution.minAddToMakeValid(s);

        assertEquals(1, result);
    }

    @Test
    public void minAddToMakeValid_2() throws Exception {
        final String s = "(((";

        final int result = solution.minAddToMakeValid(s);

        assertEquals(3, result);
    }

    @Test
    public void minAddToMakeValid_3() throws Exception {
        final String s = "()";

        final int result = solution.minAddToMakeValid(s);

        assertEquals(0, result);
    }

    @Test
    public void minAddToMakeValid_4() throws Exception {
        final String s = "()))((";

        final int result = solution.minAddToMakeValid(s);

        assertEquals(4, result);
    }
}