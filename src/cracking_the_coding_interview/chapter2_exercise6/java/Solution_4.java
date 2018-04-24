package cracking_the_coding_interview.chapter2_exercise6.java;

import Utilities.java.LinkedListUtils.Node;

import java.util.Stack;

import static Utilities.java.LinkedListUtils.createLinkedListFrom;

public class Solution_4 {

    public static void main(String[] args) {
        Node first = createLinkedListFrom(1, 2, 3, 4, 3, 2, 1);
        System.out.println(isPalindrome(first));

        Node second = createLinkedListFrom(3, 4, 5, 6);
        System.out.println(isPalindrome(second));
    }

    private static boolean isPalindrome(Node node) {
        Stack<Integer> stack = new Stack<>();

        Node fast = node;
        Node slow = node;

        while(fast != null && fast.next != null) {
            stack.push(slow.data);
            slow = slow.next;
            fast = fast.next.next;
        }

        if (fast != null)
            slow = slow.next;

        while (slow != null) {
            if (stack.pop() != slow.data)
                return false;
            slow = slow.next;
        }

        return true;
    }
}
