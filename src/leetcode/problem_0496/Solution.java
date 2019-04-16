package leetcode.problem_0496;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution {

    int[] nextGreaterElement(int[] nums1, int[] nums2) {
        final Map<Integer, Integer> map = new HashMap<>();

        final Stack<Integer> stack = new Stack<>();
        for (final int n : nums2) {
            while (!stack.isEmpty() && n > stack.peek()) {
                map.put(stack.pop(), n);
            }
            stack.push(n);
        }
        while (!stack.isEmpty()) {
            map.put(stack.pop(), -1);
        }

        final int[] nextGreater = new int[nums1.length];
        for (int i = 0; i < nextGreater.length; i++) {
            nextGreater[i] = map.get(nums1[i]);
        }
        return nextGreater;
    }
}
