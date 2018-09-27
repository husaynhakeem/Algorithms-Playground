package cracking_the_coding_interview.chapter_08.exercise_08;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {

    List<String> permutationsWithDups(final String s) {
        final Map<Character, Integer> map = buildCharacterFrequencies(s);
        final List<String> permutations = new ArrayList<>();
        computePermutations(map, "", s.length(), permutations);
        return permutations;
    }

    private Map<Character, Integer> buildCharacterFrequencies(final String s) {
        final Map<Character, Integer> map = new HashMap<>();
        for (Character c : s.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        return map;
    }

    private void computePermutations(final Map<Character, Integer> map, final String prefix, final int remainder, final List<String> permutations) {
        if (remainder == 0) {
            permutations.add(prefix);
            return;
        }
        for (Character c : map.keySet()) {
            final int count = map.get(c);
            if (count > 0) {
                map.put(c, count - 1);
                computePermutations(map, prefix + c, remainder - 1, permutations);
                map.put(c, count);
            }
        }
    }
}
