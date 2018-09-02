package cracking_the_coding_interview.chapter_01.exercise_03;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void urlify_1() throws Exception {
        final char[] chars = "Mr John Smith       ".toCharArray();

        solution.urlify(chars);

        assertEquals("Mr%20John%20Smith%20", new String(chars));
    }

    @Test
    public void urlify_2() throws Exception {
        final char[] chars = "Husayn".toCharArray();

        solution.urlify(chars);

        assertEquals("Husayn", new String(chars));
    }
}