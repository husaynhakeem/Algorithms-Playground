package big_o_la.week_03.problem_01;

class Solution_2 {

    int findMaxProfit(final int[] array) {
        final int length = array.length;

        if (length <= 1) {
            return -1;
        }

        int maxProfit = array[1] - array[0];
        int minPrice = Math.min(array[0], array[1]);
        for (int i = 2; i < length; i++) {
            final int currentPrice = array[i];
            final int currentProfit = currentPrice - minPrice;
            maxProfit = Math.max(maxProfit, currentProfit);
            minPrice = Math.min(minPrice, currentPrice);
        }

        return maxProfit;
    }
}
