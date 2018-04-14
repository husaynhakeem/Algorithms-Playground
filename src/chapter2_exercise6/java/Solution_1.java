package chapter2_exercise6.java;

import Utilities.java.LinkedListUtils.Node;

import java.util.Stack;

import static Utilities.java.LinkedListUtils.createLinkedListFrom;

public class Solution_1 {

    public static void main(String[] args) {
        Node first = createLinkedListFrom(1, 2, 3, 4, 3, 2, 1);
        System.out.println(isPalindrome(first));

        Node second = createLinkedListFrom(3, 4, 5, 6);
        System.out.println(isPalindrome(second));
    }

    private static boolean isPalindrome(Node node) {
        DoubleStack stack = new DoubleStack();
        boolean foundMiddle = false;

        while (node != null) {

            if (!stack.isEmpty() && stack.peek() == node.data) {
                stack.pop();
            } else if (stack.doublePeek() == node.data) {
                if (foundMiddle)
                    return false;
                foundMiddle = true;
                stack.doublePop();
            } else
                stack.push(node.data);
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
