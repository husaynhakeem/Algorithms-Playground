package leetcode.interview_amazon_2.problem_3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void numIslands_1() throws Exception {
        final char[][] grid = {
                {'1', '1', '1'},
                {'0', '1', '0'},
                {'1', '1', '1'}};


        final int result = solution.numIslands(grid);

        assertEquals(1, result);
    }

    @Test
    public void numIslands_2() throws Exception {
        final char[][] grid = {
                {'1', '1', '1'},
                {'0', '0', '0'},
                {'1', '1', '1'}};


        final int result = solution.numIslands(grid);

        assertEquals(2, result);
    }

    @Test
    public void numIslands_3() throws Exception {
        final char[][] grid = {{'1', '0', '1', '0', '1'}};


        final int result = solution.numIslands(grid);

        assertEquals(3, result);
    }
}