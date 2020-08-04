package leetcode.problem_0018;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);

        final int length = nums.length;

        final List<List<Integer>> quadruples = new ArrayList<>();
        for (int i = 0; i < length - 3; i++) {

            // Skip duplicate values
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            // Skip if no more results
            if (nums[i] * 4 > target) {
                break;
            }

            final List<int[]> triples = threeSum(nums, i + 1, target - nums[i]);
            for (int[] triple : triples) {
                final List<Integer> quadruple = new ArrayList<>();
                quadruple.add(nums[i]);
                quadruple.add(triple[0]);
                quadruple.add(triple[1]);
                quadruple.add(triple[2]);
                quadruples.add(quadruple);
            }
        }

        return quadruples;
    }

    private List<int[]> threeSum(int[] nums, int from, int target) {
        final int length = nums.length;

        final List<int[]> triples = new ArrayList<>();
        for (int i = from; i < length - 2; i++) {

            // Skip duplicate values
            if (i > from && nums[i] == nums[i - 1]) {
                continue;
            }

            // Skip if no more results
            if (nums[i] * 3 > target) {
                break;
            }

            final List<int[]> pairs = twoSum(nums, i + 1, target - nums[i]);
            for (int[] pair : pairs) {
                triples.add(new int[]{nums[i], pair[0], pair[1]});
            }
        }
        return triples;
    }

    private List<int[]> twoSum(int[] nums, int from, int target) {
        int right = nums.length - 1;
        int left = from;

        final List<int[]> pairs = new ArrayList<>();
        while (left < right) {

            // Skip if no more results
            if (nums[left] * 2 > target) {
                break;
            }

            if (nums[left] + nums[right] == target) {
                pairs.add(new int[]{nums[left], nums[right]});

                // Move left to the right
                left++;
                while (left <= right && nums[left] == nums[left - 1]) {
                    left++;
                }

                // Move right to the left
                right--;
                while (left <= right && nums[right] == nums[right + 1]) {
                    right--;
                }

            } else if (nums[left] + nums[right] < target) {

                // Move left to the right
                left++;
                while (left <= right && nums[left] == nums[left - 1]) {
                    left++;
                }

            } else {

                // Move right to the left
                right--;
                while (left <= right && nums[right] == nums[right + 1]) {
                    right--;
                }
            }
        }
        return pairs;
    }
}
