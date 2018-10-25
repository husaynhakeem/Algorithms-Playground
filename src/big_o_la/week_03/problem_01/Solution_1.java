package big_o_la.week_03.problem_01;

class Solution_1 {

    int findMaxProfit(final int[] array) {
        final int length = array.length;

        if (length <= 1) {
            return -1;
        }

        int profit = 0;
        int maxProfit = Integer.MIN_VALUE;

        for (int i = 0; i < length - 1; i++) {
            profit = 0;
            for (int j = i + 1; j < length; j++) {
                profit += array[j] - array[j - 1];
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }

        return maxProfit;
    }
}
