package leetcode.problem_0049;

import java.util.*;

public class Solution {

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

    private String sorted(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
