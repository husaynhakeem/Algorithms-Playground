package leetcode.problem_0771;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void numJewelsInStones_1() throws Exception {
        final String J = "aA";
        final String S = "aAAbbbb";

        final int result = solution.numJewelsInStones(J, S);

        assertEquals(3, result);
    }

    @Test
    public void numJewelsInStones_2() throws Exception {
        final String J = "z";
        final String S = "ZZ";

        final int result = solution.numJewelsInStones(J, S);

        assertEquals(0, result);
    }
}