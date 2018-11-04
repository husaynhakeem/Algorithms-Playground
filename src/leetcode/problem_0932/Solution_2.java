package leetcode.problem_0932;

class Solution_2 {

    int[] beautifulArray(final int n) {
        return beautifulArrayHelper(n);
    }

    private int[] beautifulArrayHelper(final int index) {
        if (index == 1) {
            return new int[]{1};
        }

        final int[] previousIndexBeautifulArray = beautifulArrayHelper(index - 1);
        final int[] result = new int[index];
        int resultIndex = 0;

        for (int i : previousIndexBeautifulArray) {
            if (2 * i - 1 <= index) {
                result[resultIndex++] = 2 * i - 1;
            }
        }

        for (int i : previousIndexBeautifulArray) {
            if (2 * i <= index) {
                result[resultIndex++] = 2 * i;
            }
        }

        return result;
    }
}
