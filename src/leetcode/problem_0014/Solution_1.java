package leetcode.problem_0014;

class Solution_1 {

    String longestCommonPrefix(String[] strs) {
        final StringBuilder prefix = new StringBuilder(findMin(strs));
        while (prefix.length() > 0 && !allContain(strs, prefix.toString())) {
            prefix.deleteCharAt(prefix.length() - 1);
        }
        return prefix.toString();
    }

    private String findMin(String[] strs) {
        if (strs.length == 0) {
            return "";
        }

        int minIndex = 0;
        for (int i = 1; i < strs.length; i++) {
            if (strs[minIndex].length() > strs[i].length()) {
                minIndex = i;
            }
        }
        return strs[minIndex];
    }

    private boolean allContain(String[] strs, String word) {
        for (String str: strs) {
            for (int i = 0; i < word.length(); i++) {
                if (str.charAt(i) != word.charAt(i)) {
                    return false;
                }
            }
        }
        return true;
    }
}
