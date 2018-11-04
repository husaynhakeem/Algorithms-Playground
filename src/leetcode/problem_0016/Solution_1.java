package leetcode.problem_0016;

class Solution_1 {

    int threeSumClosest(int[] array, int target) {
        final int length = array.length;

        if (length < 3) {
            return 0;
        }

        int result = target >= 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;

        for (int i = 0; i < length - 2; i++) {
            for (int j = i + 1; j < length - 1; j++) {
                for (int k = j + 1; k < length; k++) {
                    int sum = array[i] + array[j] + array[k];
                    if (Math.abs(result - target) > Math.abs(sum - target)) {
                        result = sum;
                    }
                }
            }
        }

        return result;
    }
}
