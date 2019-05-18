package leetcode.interview_google_8.problem_2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    @Test
    public void examRoom() throws Exception {
        final Solution solution = new Solution(10);

        assertEquals(0, solution.seat());
        assertEquals(9, solution.seat());
        assertEquals(4, solution.seat());
        assertEquals(2, solution.seat());

        solution.leave(4);
        assertEquals(5, solution.seat());
    }
}