package cracking_the_coding_interview.chapter_08.exercise_11;

class Solution_1 {

    int makeChange(final int n) {
        if (n <= 0) {
            return 0;
        }
        final int[] denoms = {25, 10, 5, 1};
        return makeChange(n, denoms, 0);
    }

    private int makeChange(final int n, final int[] denoms, final int index) {
        if (index >= denoms.length - 1) {
            return 1;
        }

        final int denomAmount = denoms[index];
        int ways = 0;
        for (int i = 0; i <= n / denomAmount; i++) {
            ways += makeChange(n - i * denomAmount, denoms, index + 1);
        }

        return ways;
    }
}
