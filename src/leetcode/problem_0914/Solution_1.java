package leetcode.problem_0914;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution_1 {

    boolean hasGroupsSizeX(final int[] deck) {
        final List<Integer> frequencies = getFrequencies(deck);
        final int maxFrequency = getMax(frequencies);
        return hasElementsWithCommonDividerGreaterThanOne(frequencies, maxFrequency);
    }

    private List<Integer> getFrequencies(final int[] array) {
        final Map<Integer, Integer> frequencies = new HashMap<>();
        for (int n : array) {
            int frequency = 0;
            if (frequencies.containsKey(n)) {
                frequency = frequencies.get(n);
            }
            frequencies.put(n, frequency + 1);
        }
        return new ArrayList<>(frequencies.values());
    }

    private int getMax(final List<Integer> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Cannot get max from empty list");
        }
        int max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (max < list.get(i)) {
                max = list.get(i);
            }
        }
        return max;
    }

    private boolean hasElementsWithCommonDividerGreaterThanOne(final List<Integer> list, final int dividerUpperBound) {
        for (int i = dividerUpperBound; i >= 2; i--) {
            if (allDivide(list, i)) {
                return true;
            }
        }
        return false;
    }

    private boolean allDivide(final List<Integer> list, final int n) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % n != 0) {
                return false;
            }
        }
        return true;
    }
}
