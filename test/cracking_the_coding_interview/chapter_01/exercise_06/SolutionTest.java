package cracking_the_coding_interview.chapter_01.exercise_06;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void compressString_1() {
        final String s = "aabcccccaaa";

        final String result = solution.compressString(s);

        assertEquals("a2b1c5a3", result);
    }

    @Test
    public void compressString_2() {
        final String s = "aaaaaaaaaaaabcccccaaa";

        final String result = solution.compressString(s);

        assertEquals("a12b1c5a3", result);
    }

    @Test
    public void compressString_3() {
        final String s = "abcdefg";

        final String result = solution.compressString(s);

        assertEquals("abcdefg", result);
    }
}