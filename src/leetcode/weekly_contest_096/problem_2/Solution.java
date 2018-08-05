package leetcode.weekly_contest_096.problem_2;

import java.util.HashSet;

class Solution {

    int numRescueBoats(int[] people, int limit) {
        final HashSet<Integer> indices = new HashSet<>();
        int count = 0;

        for (int i = 0; i < people.length; i++) {
            if (indices.contains(i)) {
                continue;
            }

            if (people[i] >= limit) {
                count++;
                indices.add(i);
                continue;
            }

            final int complementIndex = complement(people, i, limit, indices);
            if (complementIndex == -1) {
                count++;
                indices.add(i);
            } else {
                count++;
                indices.add(i);
                indices.add(complementIndex);
            }
        }

        return count;
    }

    private int complement(int[] array, int index, int k, HashSet<Integer> indices) {
        int complementIndex = -1;
        for (int i = index + 1; i < array.length; i++) {
            if (!indices.contains(i) && array[index] + array[i] <= k) {
                if (complementIndex == -1 || array[complementIndex] < array[i]) {
                    complementIndex = i;
                }
            }
        }
        return complementIndex;
    }
}
