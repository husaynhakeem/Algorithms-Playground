package cracking_the_coding_interview.chapter_01.exercise_03;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void urlify_1() {
        final char[] chars = "Mr John Smith       ".toCharArray();

        solution.urlify(chars, 13);

        assertEquals("Mr%20John%20Smith   ", new String(chars));
    }

    @Test
    public void urlify_2() {
        final char[] chars = "Husayn".toCharArray();

        solution.urlify(chars, 6);

        assertEquals("Husayn", new String(chars));
    }
}