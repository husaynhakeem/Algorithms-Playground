package leetcode.problem_0238;

public class Solution {

    int[] productExceptSelf(final int[] array) {
        productExceptSelfHelper(0, 1, array);
        return array;
    }

    private int productExceptSelfHelper(final int index, final int productBefore, final int[] array) {
        if (index >= array.length) {
            return 1;
        }

        final int currentValue = array[index];
        final int productAfter = productExceptSelfHelper(index + 1, productBefore * currentValue, array);
        array[index] = productBefore * productAfter;
        return currentValue * productAfter;
    }
}
