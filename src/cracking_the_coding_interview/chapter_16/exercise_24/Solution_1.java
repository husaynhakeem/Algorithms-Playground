package cracking_the_coding_interview.chapter_16.exercise_24;

import kotlin.Pair;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution_1 {

    Set<Pair<Integer, Integer>> pairsWithSum(final int[] array, final int k) {
        final Map<Integer, Integer> map = valueFrequencyMap(array, k);
        final Set<Pair<Integer, Integer>> result = new HashSet<>();

        for (int n : array) {
            if (map.containsKey(k - n)) {
                if (n == k - n && map.get(n) == 1) {
                    continue;
                }
                final int min = n < (k - n) ? n : k - n;
                final int max = n < (k - n) ? k - n : n;
                result.add(new Pair<>(min, max));
            }
        }

        return result;
    }

    private Map<Integer, Integer> valueFrequencyMap(final int[] array, final int k) {
        final Map<Integer, Integer> map = new HashMap<>();
        for (int n : array) {
            final Integer frequency = map.get(n);
            map.put(n, frequency == null ? 1 : frequency + 1);
        }
        return map;
    }
}
