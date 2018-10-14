package big_o_la.week_02.problem_05;

import org.jetbrains.annotations.NotNull;

class Solution_1 {

    int optimalStrategy(@NotNull final int[] array) {
        return optimalStrategyHelper(array, 0, array.length - 1);
    }

    private int optimalStrategyHelper(@NotNull final int[] array, final int min, final int max) {
        if (min > max || min > array.length - 1 || max < 0) {
            return 0;
        }

        final int n1 = array[min] + optimalStrategyHelper(array, min + 1, max - 1);
        final int n2 = array[min] + optimalStrategyHelper(array, min + 2, max);

        final int n3 = array[max] + optimalStrategyHelper(array, min, max - 2);
        final int n4 = array[max] + optimalStrategyHelper(array, min + 1, max - 1);

        return max(n1, n2, n3, n4);
    }

    private int max(final int a, final int b, final int c, final int d) {
        return Math.max(Math.max(a, b), Math.max(c, d));
    }
}
