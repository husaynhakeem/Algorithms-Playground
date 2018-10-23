package cracking_the_coding_interview.chapter_16.exercise_22;

import Utilities.java.GridUtils;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class Solution_1Test {

    private final Solution_1 solution = new Solution_1();

    @Test
    public void langtonsAnt_1() throws Exception {
        final int k = 0;

        final boolean[][] result = solution.langtonsAnt(k);

        final boolean[][] expectedResult = {{true}};
        assertTrue(GridUtils.areBooleanGridsEqual(expectedResult, result));
    }

    @Test
    public void langtonsAnt_2() throws Exception {
        final int k = 1;

        final boolean[][] result = solution.langtonsAnt(k);

        final boolean[][] expectedResult = {
                {true, true, true},
                {true, false, true},
                {true, true, true},
        };
        assertTrue(GridUtils.areBooleanGridsEqual(expectedResult, result));
    }

    @Test
    public void langtonsAnt_3() throws Exception {
        final int k = 2;

        final boolean[][] result = solution.langtonsAnt(k);

        final boolean[][] expectedResult = {
                {true, true, true, true, true},
                {true, true, true, true, true},
                {true, true, false, true, true},
                {true, true, false, true, true},
                {true, true, true, true, true},
        };
        assertTrue(GridUtils.areBooleanGridsEqual(expectedResult, result));
    }

    @Test
    public void langtonsAnt_4() throws Exception {
        final int k = 4;

        final boolean[][] result = solution.langtonsAnt(k);

        final boolean[][] expectedResult = solution.initBoard(k);
        expectedResult[4][4] = Solution_1.BLACK;
        expectedResult[5][4] = Solution_1.BLACK;
        expectedResult[5][3] = Solution_1.BLACK;
        expectedResult[4][3] = Solution_1.BLACK;
        assertTrue(GridUtils.areBooleanGridsEqual(expectedResult, result));
    }

    @Test
    public void langtonsAnt_5() throws Exception {
        final int k = 5;

        final boolean[][] result = solution.langtonsAnt(k);

        final boolean[][] expectedResult = solution.initBoard(k);
        expectedResult[6][5] = Solution_1.BLACK;
        expectedResult[6][4] = Solution_1.BLACK;
        expectedResult[5][4] = Solution_1.BLACK;
        assertTrue(GridUtils.areBooleanGridsEqual(expectedResult, result));
    }

    @Test
    public void langtonsAnt_6() throws Exception {
        final int k = 6;

        final boolean[][] result = solution.langtonsAnt(k);

        final boolean[][] expectedResult = solution.initBoard(k);
        expectedResult[7][6] = Solution_1.BLACK;
        expectedResult[7][5] = Solution_1.BLACK;
        expectedResult[6][5] = Solution_1.BLACK;
        expectedResult[5][6] = Solution_1.BLACK;
        assertTrue(GridUtils.areBooleanGridsEqual(expectedResult, result));
    }
}