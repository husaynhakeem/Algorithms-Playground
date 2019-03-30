package leetcode.problem_0734;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void areSentencesSimilar_1() throws Exception {
        final String[] words1 = {"great"};
        final String[] words2 = {"great"};
        final String[][] pairs = {};

        final boolean result = solution.areSentencesSimilar(words1, words2, pairs);

        assertTrue(result);
    }

    @Test
    public void areSentencesSimilar_2() throws Exception {
        final String[] words1 = {"great", "acting", "skills"};
        final String[] words2 = {"fine", "drama", "talent"};
        final String[][] pairs = {{"great", "fine"}, {"drama", "acting"}, {"skills", "talent"}};

        final boolean result = solution.areSentencesSimilar(words1, words2, pairs);

        assertTrue(result);
    }

    @Test
    public void areSentencesSimilar_3() throws Exception {
        final String[] words1 = {"an", "extraordinary", "meal"};
        final String[] words2 = {"one", "good", "dinner"};
        final String[][] pairs = {{"great", "good"}, {"extraordinary", "good"}, {"well", "good"}, {"wonderful", "good"}, {"excellent", "good"}, {"fine", "good"}, {"nice", "good"}, {"any", "one"}, {"some", "one"}, {"unique", "one"}, {"the", "one"}, {"an", "one"}, {"single", "one"}, {"a", "one"}, {"truck", "car"}, {"wagon", "car"}, {"automobile", "car"}, {"auto", "car"}, {"vehicle", "car"}, {"entertain", "have"}, {"drink", "have"}, {"eat", "have"}, {"take", "have"}, {"fruits", "meal"}, {"brunch", "meal"}, {"breakfast", "meal"}, {"food", "meal"}, {"dinner", "meal"}, {"supper", "meal"}, {"lunch", "meal"}, {"possess", "own"}, {"keep", "own"}, {"have", "own"}, {"extremely", "very"}, {"actually", "very"}, {"really", "very"}, {"super", "very"}};

        final boolean result = solution.areSentencesSimilar(words1, words2, pairs);

        assertTrue(result);
    }
}