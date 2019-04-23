package leetcode.interview_google_6.problem_1;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void areSentencesSimilar_1() {
        final String[] words1 = {"this", "summer", "thomas", "get", "actually", "actually", "rich", "and", "possess", "the", "actually", "great", "and", "fine", "vehicle", "every", "morning", "he", "drives", "one", "nice", "car", "around", "one", "great", "city", "to", "have", "single", "super", "excellent", "super", "as", "his", "brunch", "but", "he", "only", "eat", "single", "few", "fine", "food", "as", "some", "fruits", "he", "wants", "to", "eat", "an", "unique", "and", "actually", "healthy", "life"};
        final String[] words2 = {"this", "summer", "thomas", "get", "very", "very", "rich", "and", "possess", "the", "very", "fine", "and", "well", "car", "every", "morning", "he", "drives", "a", "fine", "car", "around", "unique", "great", "city", "to", "take", "any", "really", "wonderful", "fruits", "as", "his", "breakfast", "but", "he", "only", "drink", "an", "few", "excellent", "breakfast", "as", "a", "super", "he", "wants", "to", "drink", "the", "some", "and", "extremely", "healthy", "life"};
        final String[][] pairs = {{"good", "nice"}, {"good", "excellent"}, {"good", "well"}, {"good", "great"}, {"fine", "nice"}, {"fine", "excellent"}, {"fine", "well"}, {"fine", "great"}, {"wonderful", "nice"}, {"wonderful", "excellent"}, {"wonderful", "well"}, {"wonderful", "great"}, {"extraordinary", "nice"}, {"extraordinary", "excellent"}, {"extraordinary", "well"}, {"extraordinary", "great"}, {"one", "a"}, {"one", "an"}, {"one", "unique"}, {"one", "any"}, {"single", "a"}, {"single", "an"}, {"single", "unique"}, {"single", "any"}, {"the", "a"}, {"the", "an"}, {"the", "unique"}, {"the", "any"}, {"some", "a"}, {"some", "an"}, {"some", "unique"}, {"some", "any"}, {"car", "vehicle"}, {"car", "automobile"}, {"car", "truck"}, {"auto", "vehicle"}, {"auto", "automobile"}, {"auto", "truck"}, {"wagon", "vehicle"}, {"wagon", "automobile"}, {"wagon", "truck"}, {"have", "take"}, {"have", "drink"}, {"eat", "take"}, {"eat", "drink"}, {"entertain", "take"}, {"entertain", "drink"}, {"meal", "lunch"}, {"meal", "dinner"}, {"meal", "breakfast"}, {"meal", "fruits"}, {"super", "lunch"}, {"super", "dinner"}, {"super", "breakfast"}, {"super", "fruits"}, {"food", "lunch"}, {"food", "dinner"}, {"food", "breakfast"}, {"food", "fruits"}, {"brunch", "lunch"}, {"brunch", "dinner"}, {"brunch", "breakfast"}, {"brunch", "fruits"}, {"own", "have"}, {"own", "possess"}, {"keep", "have"}, {"keep", "possess"}, {"very", "super"}, {"very", "actually"}, {"really", "super"}, {"really", "actually"}, {"extremely", "super"}, {"extremely", "actually"}};

        final boolean result = solution.areSentencesSimilar(words1, words2, pairs);

        assertTrue(result);
    }
}