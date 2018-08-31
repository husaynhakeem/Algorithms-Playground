package leetcode.problem_0485;

class Solution {

    int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int temp = 0;

        for (int num : nums) {
            if (num == 1) {
                temp++;
            } else {
                if (temp > max) {
                    max = temp;
                }
                temp = 0;
            }
        }

        return temp > max ? temp : max;
    }
}
