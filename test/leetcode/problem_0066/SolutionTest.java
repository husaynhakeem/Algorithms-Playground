package leetcode.problem_0066;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void plusOne_1() throws Exception {
        final int[] digits = {0};

        final int[] result = solution.plusOne(digits);

        assertArrayEquals(new int[]{1}, result);
    }

    @Test
    public void plusOne_2() throws Exception {
        final int[] digits = {1, 2, 3};

        final int[] result = solution.plusOne(digits);

        assertArrayEquals(new int[]{1, 2, 4}, result);
    }

    @Test
    public void plusOne_3() throws Exception {
        final int[] digits = {9, 9, 9, 9};

        final int[] result = solution.plusOne(digits);

        assertArrayEquals(new int[]{1, 0, 0, 0, 0}, result);
    }
}