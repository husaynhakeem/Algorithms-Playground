package leetcode.problem_0007;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void reverse_1() throws Exception {
        final int x = 120;

        final int result = solution.reverse(x);

        assertEquals(21, result);
    }

    @Test
    public void reverse_2() throws Exception {
        final int x = 123;

        final int result = solution.reverse(x);

        assertEquals(321, result);
    }

    @Test
    public void reverse_3() throws Exception {
        final int x = -123;

        final int result = solution.reverse(x);

        assertEquals(-321, result);
    }

    @Test
    public void reverse_4() throws Exception {
        final int x = -120;

        final int result = solution.reverse(x);

        assertEquals(-21, result);
    }

    @Test
    public void reverse_5() throws Exception {
        final int x = 2_147_483_646;

        final int result = solution.reverse(x);

        assertEquals(0, result);
    }
}