package leetcode.problem_0072;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void minDistance_1() throws Exception {
        final String word1 = "";
        final String word2 = "";

        final int result = solution.minDistance(word1, word2);

        assertEquals(0, result);
    }

    @Test
    public void minDistance_2() throws Exception {
        final String word1 = "word";
        final String word2 = "";

        final int result = solution.minDistance(word1, word2);

        assertEquals(4, result);
    }

    @Test
    public void minDistance_3() throws Exception {
        final String word1 = "horse";
        final String word2 = "ros";

        final int result = solution.minDistance(word1, word2);

        assertEquals(3, result);
    }

    @Test
    public void minDistance_4() throws Exception {
        final String word1 = "intention";
        final String word2 = "execution";

        final int result = solution.minDistance(word1, word2);

        assertEquals(5, result);
    }
}