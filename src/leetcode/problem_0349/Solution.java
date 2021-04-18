package leetcode.problem_0349;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public int[] intersection(int[] nums1, int[] nums2) {
        final int[] nums = new int[1001];

        for (int num: nums1) {
            if (nums[num] == 0) {
                nums[num] = 1;
            }
        }

        final List<Integer> intersection = new ArrayList<>();
        for (int num: nums2) {
            if (nums[num] == 1) {
                intersection.add(num);
                nums[num] = 0;
            }
        }

        return toArray(intersection);
    }

    private int[] toArray(List<Integer> list) {
        final int[] array = new int[list.size()];
        int index = 0;
        for (int n: list) {
            array[index++] = n;
        }
        return array;
    }
}
