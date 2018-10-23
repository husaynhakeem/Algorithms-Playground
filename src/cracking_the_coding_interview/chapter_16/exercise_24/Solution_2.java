package cracking_the_coding_interview.chapter_16.exercise_24;

import kotlin.Pair;

import java.util.HashSet;
import java.util.Set;

class Solution_2 {

    Set<Pair<Integer, Integer>> pairsWithSum(final int[] array, final int k) {
        final Set<Integer> set = new HashSet<>();
        final Set<Pair<Integer, Integer>> result = new HashSet<>();

        for (int n : array) {
            if (set.contains(k - n)) {
                result.add(new Pair<>(n, k - n));
            }
            set.add(n);
        }

        return result;
    }
}
