package cracking_the_coding_interview.chapter_01.exercise_02;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Solution_2Test {

    private final Solution_2 solution = new Solution_2();

    @Test
    public void checkPermutation_1() throws Exception {
        final String a = "dog";
        final String b = "God";

        final boolean result = solution.checkPermutation(a, b);

        assertFalse(result);
    }

    @Test
    public void checkPermutation_2() throws Exception {
        final String a = "dog";
        final String b = "dog  ";

        final boolean result = solution.checkPermutation(a, b);

        assertFalse(result);
    }

    @Test
    public void checkPermutation_3() throws Exception {
        final String a = "dog";
        final String b = "god";

        final boolean result = solution.checkPermutation(a, b);

        assertTrue(result);
    }
}