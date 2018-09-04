package cracking_the_coding_interview.chapter_02.exercise_06;

import java.util.Stack;

class Solution_3 {

    static class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    boolean isPalindrome(Node node, int size) {
        Stack<Integer> stack = new Stack<>();
        boolean isSizeEven = size % 2 == 0;

        for (int i = 0; i < size / 2; i++) {
            stack.push(node.val);
            node = node.next;
        }

        if (!isSizeEven)
            node = node.next;

        while (node != null) {
            if (stack.pop() != node.val)
                return false;
            node = node.next;
        }

        return true;
    }
}
