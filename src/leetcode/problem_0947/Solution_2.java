package leetcode.problem_0947;

import java.util.HashSet;
import java.util.Set;

public class Solution_2 {

    int removeStones(int[][] stones) {
        final Set<int[]> seen = new HashSet<>();
        int islands = 0;

        for (final int[] stone : stones) {
            if (!seen.contains(stone)) {
                dfs(stone, stones, seen);
                islands++;
            }
        }

        return stones.length - islands;
    }

    private void dfs(final int[] stone, final int[][] stones, final Set<int[]> seen) {
        seen.add(stone);
        for (final int[] otherStone : stones) {
            if (!seen.contains(otherStone) && (stone[0] == otherStone[0] || stone[1] == otherStone[1])) {
                dfs(otherStone, stones, seen);
            }
        }
    }
}
