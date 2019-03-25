package leetcode.problem_0947;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution_2Test {

    private final Solution_2 solution = new Solution_2();

    @Test
    public void removeStones_1() throws Exception {
        final int[][] stones = {{0, 0}, {0, 1}, {1, 0}, {1, 2}, {2, 1}, {2, 2}};

        final int result = solution.removeStones(stones);

        assertEquals(5, result);
    }

    @Test
    public void removeStones_2() throws Exception {
        final int[][] stones = {{0, 0}, {0, 2}, {1, 1}, {2, 0}, {2, 2}};

        final int result = solution.removeStones(stones);

        assertEquals(3, result);
    }

    @Test
    public void removeStones_3() throws Exception {
        final int[][] stones = {{0, 0}};

        final int result = solution.removeStones(stones);

        assertEquals(0, result);
    }

    @Test
    public void removeStones_4() throws Exception {
        final int[][] stones = {{0, 1}, {1, 0}, {1, 1}};

        final int result = solution.removeStones(stones);

        assertEquals(2, result);
    }
}