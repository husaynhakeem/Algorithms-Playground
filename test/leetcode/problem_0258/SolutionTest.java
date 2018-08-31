package leetcode.problem_0258;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void addDigits_1() throws Exception {
        final int num = 38;

        final int result = solution.addDigits(num);

        assertEquals(2, result);
    }

    @Test
    public void addDigits_2() throws Exception {
        final int num = 384;

        final int result = solution.addDigits(num);

        assertEquals(6, result);
    }

    @Test
    public void addDigits_3() throws Exception {
        final int num = 5;

        final int result = solution.addDigits(num);

        assertEquals(5, result);
    }

    @Test
    public void addDigits_4() throws Exception {
        final int num = 629723;

        final int result = solution.addDigits(num);

        assertEquals(2, result);
    }
}