package big_o_la.week_04.problem_01;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void zombieClusters_1() throws Exception {
        final int[][] grid = {{}};

        final int result = solution.zombieClusters(grid);

        assertEquals(0, result);
    }

    @Test
    public void zombieClusters_2() throws Exception {
        final int[][] grid = {
                {1, 1, 0},
                {1, 1, 0},
                {0, 0, 1}
        };

        final int result = solution.zombieClusters(grid);

        assertEquals(2, result);
    }

    @Test
    public void zombieClusters_3() throws Exception {
        final int[][] grid = {
                {1, 0, 0},
                {0, 1, 0},
                {0, 0, 1}
        };

        final int result = solution.zombieClusters(grid);

        assertEquals(3, result);
    }

    @Test
    public void zombieClusters_4() throws Exception {
        final int[][] grid = {
                {1, 1, 1},
                {1, 1, 1},
                {1, 1, 1}
        };

        final int result = solution.zombieClusters(grid);

        assertEquals(1, result);
    }

    @Test
    public void zombieClusters_5() throws Exception {
        final int[][] grid = {
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1}
        };

        final int result = solution.zombieClusters(grid);

        assertEquals(1, result);
    }
}