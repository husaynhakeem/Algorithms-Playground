package cracking_the_coding_interview.chapter_02.exercise_06;

import Utilities.java.LinkedListUtils.Node;

import java.util.Stack;

import static Utilities.java.LinkedListUtils.createLinkedListFrom;

public class Solution_3 {

    public static void main(String[] args) {
        Node first = createLinkedListFrom(1, 2, 3, 4, 3, 2, 1);
        System.out.println(isPalindrome(first, 7));

        Node second = createLinkedListFrom(3, 4, 5, 6);
        System.out.println(isPalindrome(second, 4));
    }

    private static boolean isPalindrome(Node node, int size) {
        Stack<Integer> stack = new Stack<>();
        boolean isSizeEven = size % 2 == 0;

        for (int i = 0; i < size / 2; i++) {
            stack.push(node.data);
            node = node.next;
        }

        if (!isSizeEven)
            node = node.next;

        while (node != null) {
            if (stack.pop() != node.data)
                return false;
            node = node.next;
        }

        return true;
    }
}
