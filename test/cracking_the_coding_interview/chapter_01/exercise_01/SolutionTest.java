package cracking_the_coding_interview.chapter_01.exercise_01;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void isUnique_1() throws Exception {
        final String s = "is unique";

        final boolean result = solution.isUnique(s);

        assertFalse(result);
    }

    @Test
    public void isUnique_2() throws Exception {
        final String s = "Husayn";

        final boolean result = solution.isUnique(s);

        assertTrue(result);
    }

    @Test
    public void isUnique_3() throws Exception {
        final String s = "A very long string that contains more than one hundred and twenty eight characters, which is the number of characters allowed in this problem. This is an asusmption that needs to be discussed and confirmed with the interviewer during an interview";

        final boolean result = solution.isUnique(s);

        assertFalse(result);
    }

    @Test
    public void isUnique_4() throws Exception {
        final String s = "unik chars";

        final boolean result = solution.isUnique(s);

        assertTrue(result);
    }
}