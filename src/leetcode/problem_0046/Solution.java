package leetcode.problem_0046;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<List<Integer>> permute(int[] nums) {
        final List<List<Integer>> perms = new ArrayList<>();
        permute(nums, 0, perms);
        return perms;
    }

    private void permute(int[] nums, int index, List<List<Integer>> perms) {
        if (index == nums.length) {
            final List<Integer> perm = new ArrayList<>();
            for (int n : nums) {
                perm.add(n);
            }
            perms.add(perm);
        } else {
            for (int i = index; i < nums.length; i++) {
                swap(nums, index, i);
                permute(nums, index + 1, perms);
                swap(nums, i, index);
            }
        }
    }

    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
