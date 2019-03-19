package leetcode.interview_google_1.problem_1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void nextClosestTime_1() throws Exception {
        final String time = "19:34";

        final String result = solution.nextClosestTime(time);

        assertEquals("19:39", result);
    }

    @Test
    public void nextClosestTime_2() throws Exception {
        final String time = "23:59";

        final String result = solution.nextClosestTime(time);

        assertEquals("22:22", result);
    }

    @Test
    public void nextClosestTime_3() throws Exception {
        final String time = "06:25";

        final String result = solution.nextClosestTime(time);

        assertEquals("06:26", result);
    }

    @Test
    public void nextClosestTime_4() throws Exception {
        final String time = "13:55";

        final String result = solution.nextClosestTime(time);

        assertEquals("15:11", result);
    }
}