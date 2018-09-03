package cracking_the_coding_interview.chapter_01.exercise_09.java;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void isRotation_1() throws Exception {
        final String a = "waterbottle";
        final String b = "erbottlewat";

        final boolean result = solution.isRotation(a, b);

        assertTrue(result);
    }

    @Test
    public void isRotation_2() throws Exception {
        final String a = "abd";
        final String b = "dba";

        final boolean result = solution.isRotation(a, b);

        assertFalse(result);
    }
}