package leetcode.problem_0011;

public class Solution_2 {

    public int maxArea(int[] height) {
        int mostWater = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            final int water = Math.min(height[right], height[left]) * (right - left);
            mostWater = Math.max(mostWater, water);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return mostWater;
    }
}
