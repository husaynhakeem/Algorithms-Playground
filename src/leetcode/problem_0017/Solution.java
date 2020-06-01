package leetcode.problem_0017;

import java.util.*;

public class Solution {

    private static final Map<Character, char[]> MAP = new HashMap<>();

    static {
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
        return letterCombinations(digits, 0);
    }

    private List<String> letterCombinations(final String digits, int index) {
        if (index == digits.length()) {
            return new ArrayList<>();
        }

        final List<String> subCombos = letterCombinations(digits, index + 1);
        if (subCombos.isEmpty()) {
            subCombos.add("");
        }

        final char digit = digits.charAt(index);
        final List<String> combos = new ArrayList<>();
        for (char c : MAP.get(digit)) {
            for (String s : subCombos) {
                combos.add(c + s);
            }
        }

        return combos;
    }
}
