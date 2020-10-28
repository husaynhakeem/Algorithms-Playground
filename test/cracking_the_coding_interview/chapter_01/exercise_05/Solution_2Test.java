package cracking_the_coding_interview.chapter_01.exercise_05;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Solution_2Test {

    private final Solution_2 solution = new Solution_2();

    @Test
    public void oneAway_1() {
        final String a = "ple";
        final String b = "pale";

        final boolean result = solution.oneAway(a, b);

        assertTrue(result);
    }

    @Test
    public void oneAway_2() {
        final String a = "pale";
        final String b = "bale";

        final boolean result = solution.oneAway(a, b);

        assertTrue(result);
    }

    @Test
    public void oneAway_3() {
        final String a = "pales";
        final String b = "pale";

        final boolean result = solution.oneAway(a, b);

        assertTrue(result);
    }

    @Test
    public void oneAway_4() {
        final String a = "pale";
        final String b = "bake";

        final boolean result = solution.oneAway(a, b);

        assertFalse(result);
    }

    @Test
    public void oneAway_5() {
        final String a = "abcd";
        final String b = "add";

        final boolean result = solution.oneAway(a, b);

        assertFalse(result);
    }
}