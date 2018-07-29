package mit_course_6006.lecture_2;

import Utilities.java.ListUtils;
import Utilities.java.MapUtils;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SolutionTest {

    private static final String ANY_DOCUMENT_1 = "RegExr v3 was created by gskinner.com, and is proudly hosted by Media Temple.\n" +
            "\n" +
            "Edit the Expression & Text to see matches. Roll over matches or the expression for details. PCRE & Javascript flavors of RegEx are supported.\n" +
            "\n" +
            "The side bar includes a Cheatsheet, full Reference, and Help. You can also Save & Share with the Community, and view patterns you create or favorite in My Patterns.\n" +
            "\n" +
            "Explore results with the Tools below. Replace & List output custom results. Details lists capture groups. Explain describes your expression in plain English.";

    private static final String ANY_DOCUMENT_2 = "RegExr v3 was created by gskinner.com, and is proudly hosted by Media Temple.\n" +
            "\n" +
            "Edit the Expression & Text to see matches. Roll over matches or the expression for details. PCRE & Javascript flavors of RegEx are supported.\n" +
            "\n" +
            "The side bar includes a Cheatsheet, full";

    final private Solution solution = new Solution();

    @Test
    public void splitDocIntoWords() throws Exception {
        final List<String> result = solution.splitDocIntoWords(ANY_DOCUMENT_1);

        final List<String> words = ListUtils.createList("regexr", "v3", "was", "created", "by", "gskinner", "com", "and", "is", "proudly", "hosted", "by", "media", "temple", "edit", "the", "expression", "text", "to", "see", "matches", "roll", "over", "matches", "or", "the", "expression", "for", "details", "pcre", "javascript", "flavors", "of", "regex", "are", "supported", "the", "side", "bar", "includes", "a", "cheatsheet", "full", "reference", "and", "help", "you", "can", "also", "save", "share", "with", "the", "community", "and", "view", "patterns", "you", "create", "or", "favorite", "in", "my", "patterns", "explore", "results", "with", "the", "tools", "below", "replace", "list", "output", "custom", "results", "details", "lists", "capture", "groups", "explain", "describes", "your", "expression", "in", "plain", "english");
        assertEquals(words.size(), result.size());
        for (int i = 0; i < words.size(); i++) {
            assertTrue(words.get(i).equals(result.get(i)));
        }
    }

    @Test
    public void countWordFrequencies() throws Exception {
        final List<String> words = ListUtils.createList("ab", "aab", "aab1", "aab", "ab");

        final Map<String, Integer> result = solution.countWordFrequencies(words);

        assertEquals(3, result.size());
        assertEquals(2, (int) result.get("ab"));
        assertEquals(2, (int) result.get("aab"));
        assertEquals(1, (int) result.get("aab1"));
    }

    @Test
    public void countInnerProduct() throws Exception {
        final String[] keys1 = {"ab", "aab", "boat", "car", "truck"};
        final Integer[] values1 = {1, 2, 4, 2, 1};
        final Map<String, Integer> map1 = MapUtils.createMap(keys1, values1);

        final String[] keys2 = {"boat", "ob", "oob", "truck", "cars"};
        final Integer[] values2 = {2, 3, 1, 5, 4};
        final Map<String, Integer> map2 = MapUtils.createMap(keys2, values2);

        final int result = solution.countInnerProduct(map1, map2);

        assertEquals(13, result);
    }

    @Test
    public void computeDistanceInternal() throws Exception {
        final String[] keys1 = {"ab", "aab", "boat", "car", "truck"};
        final Integer[] values1 = {1, 2, 4, 2, 1};
        final Map<String, Integer> map1 = MapUtils.createMap(keys1, values1);

        final String[] keys2 = {"boat", "ob", "oob", "truck", "cars"};
        final Integer[] values2 = {2, 3, 1, 5, 4};
        final Map<String, Integer> map2 = MapUtils.createMap(keys2, values2);

        final double result = solution.computeDistanceInternal(map1, map2);

        assertEquals(1.22, result, 0.01);
    }

    @Test
    public void computeDistance_1() throws Exception {
        final double result = solution.computeDistance(ANY_DOCUMENT_1, ANY_DOCUMENT_1);

        assertEquals(0, result, 0);
    }

    @Test
    public void computeDistance_2() throws Exception {
        final double result = solution.computeDistance(ANY_DOCUMENT_1, ANY_DOCUMENT_2);

        assertEquals(0.68, result, 0.01);
    }
}