package leetcode.interview_amazon_2.problem_1;

public class Solution_2 {

    int maxProfit(final int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (final int price: prices) {
            if (price < minPrice) {
                minPrice = price;
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }

        return maxProfit;
    }
}
