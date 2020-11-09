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

    boolean isPalindrome(Node node) {
        Stack<Integer> stack = new Stack<>();

        Node fast = node;
        Node slow = node;

        while (fast != null && fast.next != null) {
            stack.push(slow.val);
            slow = slow.next;
            fast = fast.next.next;
        }

        if (fast != null)
            slow = slow.next;

        while (slow != null) {
            if (stack.pop() != slow.val)
                return false;
            slow = slow.next;
        }

        return true;
    }
}
