package leetcode.problem_0520;

class Solution {

    boolean detectCapitalUse(String word) {
        final char firstChar = word.charAt(0);
        if (isLowercase(firstChar)) {
            return containsOnlyLowercaseFrom(word, 1);
        }

        if (word.length() == 1) {
            return true;
        }

        final char secondChar = word.charAt(1);
        if (isLowercase(secondChar)) {
            return containsOnlyLowercaseFrom(word, 2);
        }
        return containsOnlyUppercaseFrom(word, 2);
    }

    private boolean containsOnlyLowercaseFrom(final String word, final int beginIndex) {
        for (int i = beginIndex; i < word.length(); i++) {
            if (isUppercase(word.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    private boolean containsOnlyUppercaseFrom(final String word, final int beginIndex) {
        for (int i = beginIndex; i < word.length(); i++) {
            if (isLowercase(word.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    private boolean isLowercase(final char c) {
        return 'a' <= c && c <= 'z';
    }

    private boolean isUppercase(final char c) {
        return 'A' <= c && c <= 'Z';
    }
}
