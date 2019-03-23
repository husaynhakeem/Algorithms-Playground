package leetcode.interview_google_3.problem_4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private Solution solution = new Solution();

    @Test
    public void longestIncreasingPath_1() throws Exception {
        final int[][] matrix = {{9, 9, 4}, {6, 6, 8}, {2, 1, 1}};

        final int result = solution.longestIncreasingPath(matrix);

        assertEquals(4, result);
    }

    @Test
    public void longestIncreasingPath_2() throws Exception {
        final int[][] matrix = {{3, 4, 5}, {3, 2, 6}, {2, 2, 1}};

        final int result = solution.longestIncreasingPath(matrix);

        assertEquals(4, result);
    }
}