package leetcode.interview_google_2.problem_2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void totalFruit_1() throws Exception {
        final int[] tree = {1, 0, 1, 4, 1, 4, 1, 2, 3};

        final int result = solution.totalFruit(tree);

        assertEquals(5, result);
    }

    @Test
    public void totalFruit_2() throws Exception {
        final int[] tree = {1, 2, 1};

        final int result = solution.totalFruit(tree);

        assertEquals(3, result);
    }

    @Test
    public void totalFruit_3() throws Exception {
        final int[] tree = {0, 1, 2, 2};

        final int result = solution.totalFruit(tree);

        assertEquals(3, result);
    }
}