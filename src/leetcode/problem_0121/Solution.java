package leetcode.problem_0121;

public class Solution {

    int maxProfit(final int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (final int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }

        return maxProfit;
    }
}
