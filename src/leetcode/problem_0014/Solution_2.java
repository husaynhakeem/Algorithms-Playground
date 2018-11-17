package leetcode.problem_0014;

class Solution_2 {

    String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }

        final String first = strs[0];

        for (int i = 0; i < first.length(); i++) {
            final char c = first.charAt(i);
            for (String str : strs) {
                if (i == str.length() || str.charAt(i) != c) {
                    return first.substring(0, i);
                }
            }
        }

        return first;
    }
}
