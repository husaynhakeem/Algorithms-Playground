package leetcode.problem_0804;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void uniqueMorseRepresentations_1() throws Exception {
        final String[] words = {};

        final int result = solution.uniqueMorseRepresentations(words);

        assertEquals(0, result);
    }

    @Test
    public void uniqueMorseRepresentations_2() throws Exception {
        final String[] words = {"gin", "zen", "gig", "msg"};

        final int result = solution.uniqueMorseRepresentations(words);

        assertEquals(2, result);
    }
}