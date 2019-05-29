package leetcode.problem_0127;

import Utilities.java.ListUtils;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void ladderLength_1() throws Exception {
        final String begin = "hit";
        final String end = "cog";
        final List<String> words = ListUtils.createList("hot", "dot", "dog", "lot", "log", "cog");

        final int result = solution.ladderLength(begin, end, words);

        assertEquals(5, result);
    }

    @Test
    public void ladderLength_2() throws Exception {
        final String begin = "hit";
        final String end = "cog";
        final List<String> words = ListUtils.createList("hot", "dot", "dog", "lot", "log");

        final int result = solution.ladderLength(begin, end, words);

        assertEquals(0, result);
    }

    @Test
    public void ladderLength_3() throws Exception {
        final String begin = "qa";
        final String end = "sq";
        final List<String> words = ListUtils.createList("si", "go", "se", "cm", "so", "ph", "mt", "db", "mb", "sb", "kr", "ln", "tm", "le", "av", "sm", "ar", "ci", "ca", "br", "ti", "ba", "to", "ra", "fa", "yo", "ow", "sn", "ya", "cr", "po", "fe", "ho", "ma", "re", "or", "rn", "au", "ur", "rh", "sr", "tc", "lt", "lo", "as", "fr", "nb", "yb", "if", "pb", "ge", "th", "pm", "rb", "sh", "co", "ga", "li", "ha", "hz", "no", "bi", "di", "hi", "qa", "pi", "os", "uh", "wm", "an", "me", "mo", "na", "la", "st", "er", "sc", "ne", "mn", "mi", "am", "ex", "pt", "io", "be", "fm", "ta", "tb", "ni", "mr", "pa", "he", "lr", "sq", "ye");

        final int result = solution.ladderLength(begin, end, words);

        assertEquals(5, result);
    }
}