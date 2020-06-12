package leetcode.problem_0011;

public class Solution_1 {

    public int maxArea(int[] height) {
        int mostWater = 0;
        for (int i = 0; i < height.length - 1; i++) {
            for (int j = i + 1; j < height.length; j++) {
                final int water = Math.min(height[i], height[j]) * (j - i);
                mostWater = Math.max(water, mostWater);
            }
        }
        return mostWater;
    }
}
