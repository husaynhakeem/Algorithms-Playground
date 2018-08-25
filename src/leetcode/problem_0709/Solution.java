package leetcode.problem_0709;

class Solution {

    String toLowerCase(String str) {
        final StringBuilder sb = new StringBuilder();
        for (Character c : str.toCharArray()) {
            sb.append(toLowerCase(c));
        }
        return sb.toString();
    }

    private char toLowerCase(char c) {
        if ((!isLowerCase(c) && !isUpperCase(c)) || isLowerCase(c)) {
            return c;
        }
        return (char) ('a' - 'A' + c);
    }

    private boolean isLowerCase(char c) {
        return 'a' <= c && c <= 'z';
    }

    private boolean isUpperCase(char c) {
        return 'A' <= c && c <= 'Z';
    }
}
