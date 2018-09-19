package cracking_the_coding_interview.chapter_10.exercise_02;

import org.jetbrains.annotations.NotNull;

import java.util.*;

class Solution_1 {

    void groupAnagrams(@NotNull final String[] array) {
        final Map<String, List<String>> map = new HashMap<>();

        for (String s : array) {
            final String key = sortChars(s);
            map.computeIfAbsent(key, k -> new ArrayList<>());
            map.get(key).add(s);
        }

        int index = 0;
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            for (String s : entry.getValue()) {
                array[index++] = s;
            }
        }
    }

    private String sortChars(final String s) {
        final char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
