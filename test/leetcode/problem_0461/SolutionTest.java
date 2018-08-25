package leetcode.problem_0461;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private Solution solution = new Solution();

    @Test
    public void hammingDistance_1() throws Exception {
        final int x = 1;
        final int y = 4;

        final int result = solution.hammingDistance(x, y);

        assertEquals(2, result);
    }

    @Test
    public void hammingDistance_2() throws Exception {
        final int x = 1679;
        final int y = 782;

        final int result = solution.hammingDistance(x, y);

        assertEquals(4, result);
    }

    @Test
    public void hammingDistance_3() throws Exception {
        final int x = 278;
        final int y = 617881;

        final int result = solution.hammingDistance(x, y);

        assertEquals(11, result);
    }
}