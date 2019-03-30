package leetcode.problem_0947;

import java.util.HashMap;
import java.util.Map;

public class Solution_3 {

    int removeStones(int[][] stones) {
        final IntWrapper islands = new IntWrapper(stones.length);

        final Map<String, String> parent = new HashMap<>();
        for (final int[] stone : stones) {
            String key = key(stone[0], stone[1]);
            parent.put(key, key);
        }

        for (int i = 0; i < stones.length; i++) {
            for (int j = i + 1; j < stones.length; j++) {
                if (stones[i][0] == stones[j][0] || stones[i][1] == stones[j][1]) {
                    union(key(stones[i][0], stones[i][1]), key(stones[j][0], stones[j][1]), parent, islands);
                }
            }
        }

        return stones.length - islands.value;
    }

    private void union(final String a, final String b, final Map<String, String> parent, final IntWrapper islands) {
        final String parentA = find(a, parent);
        final String parentB = find(b, parent);
        if (!parentA.equals(parentB)) {
            parent.put(parentA, parentB);
            islands.value--;
        }
    }

    private String find(final String a, final Map<String, String> parent) {
        if (!a.equals(parent.get(a))) {
            parent.put(a, find(parent.get(a), parent));
        }
        return parent.get(a);
    }

    private String key(final int row, final int col) {
        return row + "," + col;
    }

    class IntWrapper {
        int value;

        IntWrapper(final int value) {
            this.value = value;
        }
    }
}
