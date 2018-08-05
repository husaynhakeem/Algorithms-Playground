package leetcode.problem_0232;

import java.util.Stack;

class Solution {

    static class MyQueue {

        // I assume my stack always contains the oldest elements on the top
        private final Stack<Integer> stack;

        /**
         * Initialize your data structure here.
         */
        public MyQueue() {
            stack = new Stack<>();
        }

        /**
         * Push element x to the back of queue.
         */
        public void push(int x) {
            final Stack<Integer> tempStack = new Stack<>();
            while (!stack.isEmpty()) {
                final int n = stack.pop();
                tempStack.push(n);
            }
            stack.push(x);
            while (!tempStack.isEmpty()) {
                final int n = tempStack.pop();
                stack.push(n);
            }
        }

        /**
         * Removes the element from in front of queue and returns that element.
         */
        public int pop() {
            if (!stack.isEmpty()) {
                return stack.pop();
            }
            throw new RuntimeException("MyQueue.pop(): Empty queue");
        }

        /**
         * Get the front element.
         */
        public int peek() {
            if (!stack.isEmpty()) {
                return stack.peek();
            }
            throw new RuntimeException("MyQueue.peek(): Empty queue");
        }

        /**
         * Returns whether the queue is empty.
         */
        public boolean empty() {
            return stack.isEmpty();
        }
    }
}
