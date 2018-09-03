package cracking_the_coding_interview.chapter_01.exercise_05;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void oneAway_1() throws Exception {
        final String a = "ple";
        final String b = "pale";

        final boolean result = solution.oneAway(a, b);

        assertTrue(result);
    }

    @Test
    public void oneAway_2() throws Exception {
        final String a = "pale";
        final String b = "bale";

        final boolean result = solution.oneAway(a, b);

        assertTrue(result);
    }

    @Test
    public void oneAway_3() throws Exception {
        final String a = "pales";
        final String b = "pale";

        final boolean result = solution.oneAway(a, b);

        assertTrue(result);
    }

    @Test
    public void oneAway_4() throws Exception {
        final String a = "pale";
        final String b = "bake";

        final boolean result = solution.oneAway(a, b);

        assertFalse(result);
    }

    @Test
    public void oneAway_5() throws Exception {
        final String a = "abcd";
        final String b = "add";

        final boolean result = solution.oneAway(a, b);

        assertFalse(result);
    }
}