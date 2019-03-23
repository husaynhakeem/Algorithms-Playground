package leetcode.interview_google_3.problem_1;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void juddeCircle_1() throws Exception {
        final String moves = "UD";

        final boolean result = solution.judgeCircle(moves);

        assertTrue(result);
    }

    @Test
    public void juddeCircle_2() throws Exception {
        final String moves = "UDDLRRDLLULR";

        final boolean result = solution.judgeCircle(moves);

        assertFalse(result);
    }
}