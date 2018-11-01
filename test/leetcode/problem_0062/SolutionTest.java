package leetcode.problem_0062;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution_1Test {

    private final Solution_1 solution = new Solution_1();

    @Test
    public void uniquePaths_1() throws Exception {
        final int m = 3;
        final int n = 2;

        final int result = solution.uniquePaths(m, n);

        assertEquals(3, result);
    }

    @Test
    public void uniquePaths_2() throws Exception {
        final int m = 7;
        final int n = 3;

        final int result = solution.uniquePaths(m, n);

        assertEquals(28, result);
    }

    @Test
    public void uniquePaths_3() throws Exception {
        final int m = 23;
        final int n = 12;

        final int result = solution.uniquePaths(m, n);

        assertEquals(193_536_720, result);
    }
}