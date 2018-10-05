package big_o_la.week_02.problem_03;

import org.jetbrains.annotations.NotNull;

class Solution_1 {

    private static final int NIL = -1;

    int robbery(@NotNull final int[] array) {
        final int[] memo = new int[array.length + 2];
        fillArrayWith(memo, NIL);
        return robberyHelper(array, 0, memo);
    }

    private void fillArrayWith(@NotNull final int[] array, final int value) {
        for (int i = 0; i < array.length; i++) {
            array[i] = value;
        }
    }

    private int robberyHelper(@NotNull final int[] array, final int index, final int[] memo) {
        if (index > array.length - 1) {
            return 0;
        }

        if (index == array.length - 1) {
            return array[index];
        }

        if (memo[index] != NIL) {
            return memo[index];
        }

        if (index + 2 < memo.length) {
            memo[index + 2] = robberyHelper(array, index + 2, memo);
        }

        if (index + 3 < memo.length) {
            memo[index + 3] = robberyHelper(array, index + 3, memo);
        }

        final int max1 = array[index] + memo[index + 2];
        final int max2 = index < array.length - 1 ? array[index + 1] + memo[index + 3] : 0;

        return Math.max(max1, max2);
    }
}
