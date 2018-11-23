package leetcode.problem_0151;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void reverseWords_1() throws Exception {
        final String s = null;

        final String result = solution.reverseWords(s);

        assertNull(result);
    }

    @Test
    public void reverseWords_2() throws Exception {
        final String s = "    ";

        final String result = solution.reverseWords(s);

        assertTrue(result.isEmpty());
    }

    @Test
    public void reverseWords_3() throws Exception {
        final String s = " The sky    is    blue    ";

        final String result = solution.reverseWords(s);

        assertEquals("blue is sky The", result);
    }
}