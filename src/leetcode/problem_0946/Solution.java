package leetcode.problem_0946;

import java.util.Stack;

public class Solution {

    boolean validateStackSequences(final int[] pushed, final int[] popped) {
        final Stack<Integer> stack = new Stack<>();
        int poppedIndex = 0;
        int pushedIndex = 0;

        while (pushedIndex < pushed.length && poppedIndex < popped.length) {
            stack.push(pushed[pushedIndex++]);
            while (!stack.isEmpty() && poppedIndex < popped.length) {
                if (stack.peek() == popped[poppedIndex]) {
                    stack.pop();
                    poppedIndex++;
                } else {
                    break;
                }
            }
        }

        return stack.isEmpty() && poppedIndex == popped.length;
    }
}
