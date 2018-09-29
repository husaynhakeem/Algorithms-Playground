package cracking_the_coding_interview.chapter_08.exercise_09;

import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void parens_1() throws Exception {
        final int n = 0;

        final Set<String> result = solution.parens(n);

        assertEquals(1, result.size());
        assertTrue(result.contains(""));
    }

    @Test
    public void parens_2() throws Exception {
        final int n = 1;

        final Set<String> result = solution.parens(n);

        assertEquals(1, result.size());
        assertTrue(result.contains("()"));
    }

    @Test
    public void parens_3() throws Exception {
        final int n = 2;

        final Set<String> result = solution.parens(n);

        assertEquals(2, result.size());
        assertTrue(result.contains("()()"));
        assertTrue(result.contains("(())"));
    }

    @Test
    public void parens_4() throws Exception {
        final int n = 3;

        final Set<String> result = solution.parens(n);

        assertEquals(5, result.size());
        assertTrue(result.contains("()()()"));
        assertTrue(result.contains("((()))"));
        assertTrue(result.contains("(()())"));
        assertTrue(result.contains("(())()"));
        assertTrue(result.contains("()(())"));
    }
}