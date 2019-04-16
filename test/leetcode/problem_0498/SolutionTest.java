package leetcode.problem_0498;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void findDiagonalOrder() throws Exception {
        final int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        final int[] result = solution.findDiagonalOrder(matrix);

        assertArrayEquals(new int[]{1, 2, 4, 7, 5, 3, 6, 8, 9}, result);
    }
}