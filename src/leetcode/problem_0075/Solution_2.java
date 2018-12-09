package leetcode.problem_0075;

class Solution_2 {

    void sortColors(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int index = 0;

        while (index <= end) {
            if (nums[index] == 0) {
                nums[index] = nums[start];
                nums[start] = 0;
                start++;
            }
            if (nums[index] == 2) {
                nums[index] = nums[end];
                nums[end] = 2;
                end--;
                index--;
            }
            index++;
        }
    }
}
