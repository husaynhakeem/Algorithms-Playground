package cracking_the_coding_interview.chapter_08.exercise_08;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SolutionTest {

    private final Solution solution = new Solution();


    @Test
    public void permutationsWithDups_1() throws Exception {
        final String word = "";

        final List<String> result = solution.permutationsWithDups(word);

        assertEquals(1, result.size());
        assertTrue(result.contains(""));
    }

    @Test
    public void permutationsWithDups_2() throws Exception {
        final String word = "a";

        final List<String> result = solution.permutationsWithDups(word);

        assertEquals(1, result.size());
        assertTrue(result.contains("a"));
    }

    @Test
    public void permutationsWithDups_3() throws Exception {
        final String word = "ab";

        final List<String> result = solution.permutationsWithDups(word);

        assertEquals(2, result.size());
        assertTrue(result.contains("ab"));
        assertTrue(result.contains("ba"));
    }

    @Test
    public void permutationsWithDups_4() throws Exception {
        final String word = "abc";

        final List<String> result = solution.permutationsWithDups(word);

        assertEquals(6, result.size());
        assertTrue(result.contains("cba"));
        assertTrue(result.contains("bca"));
        assertTrue(result.contains("bac"));
        assertTrue(result.contains("cab"));
        assertTrue(result.contains("acb"));
        assertTrue(result.contains("abc"));
    }

    /*
    Using the solution from exercise 7, this method takes very long before
    causing an error (GC overhead limit exceeded). With the current method,
    it executes in a couple of milliseconds
     */
    @Test
    public void permutationsWithDups_5() throws Exception {
        final String word = "aaaaaaaaaaaaaaaaaa";

        solution.permutationsWithDups(word);
    }
}