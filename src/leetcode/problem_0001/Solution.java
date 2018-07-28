package leetcode.problem_0001;

import java.util.Hashtable;

public class Solution {

    int[] twoSum(int[] nums, int target) {
        final Hashtable<Integer, Integer> map = new Hashtable<>();
        for (int i = 0; i < nums.length; i++) {
            final int key = target - nums[i];
            if (map.containsKey(key)) {
                return new int[]{map.get(key), i};
            }
            map.put(nums[i], i);
        }
        throw new RuntimeException("No solution found");
    }
}
