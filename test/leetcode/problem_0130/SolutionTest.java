package leetcode.problem_0130;

import Utilities.java.GridUtils;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void solve_1() throws Exception {
        final char[][] board = {
                {'X', 'X', 'X', 'X'},
                {'X', 'O', 'O', 'X'},
                {'X', 'X', 'O', 'X'},
                {'X', 'O', 'X', 'X'}};

        solution.solve(board);

        final char[][] expectedResult = {
                {'X', 'X', 'X', 'X'},
                {'X', 'X', 'X', 'X'},
                {'X', 'X', 'X', 'X'},
                {'X', 'O', 'X', 'X'}
        };
        assertTrue(GridUtils.areCharGridsEqual(expectedResult, board));
    }

    @Test
    public void solve_2() throws Exception {
        final char[][] board = {
                {'O', 'X', 'X', 'O', 'X'},
                {'X', 'O', 'O', 'X', 'O'},
                {'X', 'O', 'X', 'O', 'X'},
                {'O', 'X', 'O', 'O', 'O'},
                {'X', 'X', 'O', 'X', 'O'}};

        solution.solve(board);

        final char[][] expectedResult = {
                {'O', 'X', 'X', 'O', 'X'},
                {'X', 'X', 'X', 'X', 'O'},
                {'X', 'X', 'X', 'O', 'X'},
                {'O', 'X', 'O', 'O', 'O'},
                {'X', 'X', 'O', 'X', 'O'}};
        assertTrue(GridUtils.areCharGridsEqual(expectedResult, board));
    }
}