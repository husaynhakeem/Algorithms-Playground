package cracking_the_coding_interview.chapter_16.exercise_02;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionFollowupTest {

    private final SolutionFollowup solution = new SolutionFollowup();

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
        final String word1 = " Husayn ";
        final String word2 = " some   ";
        final String[] book = {" ", "Just", "some", " ", "random", "Husayn", "words", "::", "husayn", ",", "hus", "eof", "Husayn      ", "", "", "some    "};

        final int result1 = solution.wordFrequencies(word1, book);
        final int result2 = solution.wordFrequencies(word2, book);

        assertEquals(3, result1);
        assertEquals(2, result2);
    }
}