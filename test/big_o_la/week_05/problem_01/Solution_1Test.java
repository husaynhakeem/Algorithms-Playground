package big_o_la.week_05.problem_01;

import big_o_la.week_05.problem_01.Solution_1.QueenResult;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Solution_1Test {

    private final Solution_1 solution = new Solution_1();

    @Test
    public void nQueens_1() throws Exception {
        final int size = 2;

        final List<QueenResult> result = solution.nQueens(size);

        assertTrue(result.isEmpty());
    }

    @Test
    public void nQueens_2() throws Exception {
        final int size = 3;

        final List<QueenResult> result = solution.nQueens(size);

        assertTrue(result.isEmpty());
    }

    @Test
    public void nQueens_3() throws Exception {
        final int size = 4;

        final List<QueenResult> result = solution.nQueens(size);

        assertEquals(2, result.size());
    }

    @Test
    public void nQueens_4() throws Exception {
        final int size = 5;

        final List<QueenResult> result = solution.nQueens(size);

        assertEquals(7, result.size());
    }

    @Test
    public void nQueens_5() throws Exception {
        final int size = 6;

        final List<QueenResult> result = solution.nQueens(size);

        assertEquals(1, result.size());
    }

    @Test
    public void nQueens_6() throws Exception {
        final int size = 7;

        final List<QueenResult> result = solution.nQueens(size);

        assertEquals(6, result.size());
    }

    @Test
    public void nQueens_7() throws Exception {
        final int size = 8;

        final List<QueenResult> result = solution.nQueens(size);

        assertEquals(1, result.size());
    }
}