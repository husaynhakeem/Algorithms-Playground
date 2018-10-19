package cracking_the_coding_interview.chapter_16.exercise_21;

import kotlin.Pair;
import org.jetbrains.annotations.NotNull;

import java.util.HashSet;
import java.util.Set;

class Solution_1 {

    static final Pair<Integer, Integer> INVALID_PAIR = new Pair<>(-1, -1);

    Pair<Integer, Integer> sumSwap(@NotNull final int[] a, final int[] b) {
        final int sumA = sum(a);
        final int sumB = sum(b);
        final int sum = sumA + sumB;

        if (sum % 2 == 1) {
            return INVALID_PAIR;
        }

        final Set<Integer> setA = set(a);
        final Set<Integer> setB = set(b);
        final int half = sum / 2;

        for (int elementA : setA) {
            for (int elementB : setB) {
                if (sumA - elementA + elementB == half) {
                    return new Pair<>(elementA, elementB);
                }
            }
        }

        return INVALID_PAIR;
    }

    private int sum(@NotNull final int[] array) {
        int sum = 0;
        for (int n : array) {
            sum += n;
        }
        return sum;
    }

    private Set<Integer> set(@NotNull final int[] array) {
        final Set<Integer> set = new HashSet<>();
        for (int n : array) {
            set.add(n);
        }
        return set;
    }
}
