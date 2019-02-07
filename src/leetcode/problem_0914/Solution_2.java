package leetcode.problem_0914;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution_2 {

    boolean hasGroupsSizeX(final int[] deck) {
        final List<Integer> frequencies = getFrequencies(deck);
        return getGreatestCommonDivider(frequencies) > 1;
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

    private int getGreatestCommonDivider(final List<Integer> list) {
        return getGreatestCommonDivider(list, 0);
    }

    private int getGreatestCommonDivider(final List<Integer> list, final int index) {
        if (index == list.size() - 1) {
            return list.get(index);
        }
        return getGreatestCommonDivider(list.get(index), getGreatestCommonDivider(list, index + 1));
    }

    private int getGreatestCommonDivider(final int a, final int b) {
        return b > 0 ? getGreatestCommonDivider(b, a % b) : a;
    }
}
