package cracking_the_coding_interview.chapter_02.exercise_06;

import java.util.Stack;

class Solution_1 {

    static class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    boolean isPalindrome(Node node) {
        DoubleStack stack = new DoubleStack();
        boolean foundMiddle = false;

        while (node != null) {
            if (!stack.isEmpty() && stack.peek() == node.val) {
                stack.pop();
            } else if (stack.doublePeek() == node.val) {
                if (foundMiddle)
                    return false;
                foundMiddle = true;
                stack.doublePop();
            } else {
                stack.push(node.val);
            }
            node = node.next;
        }

        return stack.isEmpty();
    }

    private static class DoubleStack extends Stack<Integer> {

        int doublePeek() {
            if (size() > 1)
                return elementAt(size() - 2);
            return Integer.MIN_VALUE;
        }

        void doublePop() {
            this.pop();
            this.pop();
        }
    }
}
