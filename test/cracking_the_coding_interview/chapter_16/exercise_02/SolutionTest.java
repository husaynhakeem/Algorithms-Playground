package cracking_the_coding_interview.chapter_16.exercise_02;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void wordFrequencies_1() throws Exception {
        final String word = null;
        final String[] book = null;

        final int result = solution.wordFrequencies(word, book);

        assertEquals(0, result);
    }

    @Test
    public void wordFrequencies_2() throws Exception {
        final String word = "";
        final String[] book = {};

        final int result = solution.wordFrequencies(word, book);

        assertEquals(0, result);
    }

    @Test
    public void wordFrequencies_3() throws Exception {
        final String word = " Husayn ";
        final String[] book = {" ", "Just", "some", " ", "random", "Husayn", "words", "::", "husayn", ",", "hus", "eof", "Husayn      ", "", "", ""};

        final int result = solution.wordFrequencies(word, book);

        assertEquals(3, result);
    }
}