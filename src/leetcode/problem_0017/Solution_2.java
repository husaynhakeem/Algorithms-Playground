package leetcode.problem_0017;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution_2 {

    private static final Map<Character, char[]> MAP;

    static {
        MAP = new HashMap<>();
        MAP.put('2', new char[]{'a', 'b', 'c'});
        MAP.put('3', new char[]{'d', 'e', 'f'});
        MAP.put('4', new char[]{'g', 'h', 'i'});
        MAP.put('5', new char[]{'j', 'k', 'l'});
        MAP.put('6', new char[]{'m', 'n', 'o'});
        MAP.put('7', new char[]{'p', 'q', 'r', 's'});
        MAP.put('8', new char[]{'t', 'u', 'v'});
        MAP.put('9', new char[]{'w', 'x', 'y', 'z'});
    }

    public List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) {
            return new ArrayList<>();
        }

        final List<String> combinations = new ArrayList<>();
        letterCombinationsHelper(digits, 0, new StringBuilder(), combinations);
        return combinations;
    }

    private void letterCombinationsHelper(String digits, int index, StringBuilder sb, List<String> combinations) {
        if (index == digits.length()) {
            combinations.add(sb.toString());
            return;
        }

        final char digit = digits.charAt(index);
        final char[] letters = MAP.get(digit);

        for (final char letter : letters) {
            sb.append(letter);
            letterCombinationsHelper(digits, index + 1, sb, combinations);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
