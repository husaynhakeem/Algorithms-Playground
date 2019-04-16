package leetcode.problem_0947;

import java.util.HashMap;
import java.util.Map;

public class Solution_4 {

    private static final int MAX_VALUE = 10000;

    int removeStones(int[][] stones) {
        final Map<Integer, Integer> parent = new HashMap<>();
        final IntWrapper islands = new IntWrapper();

        for (int i = 0; i < stones.length; i++) {
            union(stones[i][0], stones[i][1] + MAX_VALUE, parent, islands);
        }

        return stones.length - islands.value;
    }

    private void union(final int row, final int col, final Map<Integer, Integer> parent, final IntWrapper islands) {
        final int parentRow = find(row, parent, islands);
        final int parentCol = find(col, parent, islands);
        if (parentRow != parentCol) {
            parent.put(parentRow, parentCol);
            islands.value--;
        }
    }

    private int find(final int n, final Map<Integer, Integer> parent, final IntWrapper islands) {
        if (parent.putIfAbsent(n, n) == null) {
            islands.value++;
        }
        if (n != parent.get(n)) {
            parent.put(n, find(parent.get(n), parent, islands));
        }

        return parent.get(n);
    }

    class IntWrapper {
        int value;
    }
}
