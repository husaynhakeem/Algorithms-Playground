package leetcode.problem_0307;

class Solution_2 {

    private final int[] array;

    Solution_2(final int[] array) {
        this.array = array;
    }

    void update(final int index, final int newValue) {
        if (isOutOfBounds(index)) {
            return;
        }
        array[index] = newValue;
    }

    int sumRange(final int start, final int end) {
        if (isOutOfBounds(start) || isOutOfBounds(end)) {
            return 0;
        }

        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += array[i];
        }
        return sum;
    }

    private boolean isOutOfBounds(final int index) {
        return index < 0 || index >= array.length;
    }
}
