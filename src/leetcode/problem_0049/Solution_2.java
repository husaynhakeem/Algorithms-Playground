package leetcode.problem_0049;

import java.util.*;

public class Solution_2 {

    public List<List<String>> groupAnagrams(String[] strs) {
        final Map<String, List<String>> dict = new HashMap<>();
        for (String str : strs) {
            String sorted = sorted(str);

            List<String> group = dict.computeIfAbsent(sorted, k -> new ArrayList<>());
            group.add(str);
        }

        List<List<String>> groups = new ArrayList<>();
        for (Map.Entry<String, List<String>> entry : dict.entrySet()) {
            groups.add(entry.getValue());
        }

        return groups;
    }

    /**
     * Sorts the input string using counting sort (Runtime complexity of O(K), K being the length of the string).
     */
    private String sorted(String str) {
        char[] chars = str.toCharArray();

        int[] charsCount = new int[26];
        Arrays.fill(charsCount, 0);

        for (char c : chars) {
            charsCount[c - 'a']++;
        }

        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < charsCount.length; i++) {
            int count = charsCount[i];
            char c = (char) ('a' + i);
            for (int j = 0; j < count; j++) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
