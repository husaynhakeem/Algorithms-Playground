package cracking_the_coding_interview.chapter_02.exercise_05;

import org.jetbrains.annotations.NotNull;

public class Solution_4 {

    static class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    Node sumLists(@NotNull Node first, @NotNull Node second) {
        Node result = new Node(0);
        Node runner = result;

        int prev = 0;
        while (first != null || second != null || prev != 0) {
            int firstDigit = first == null ? 0 : first.val;
            int secondDigit = second == null ? 0 : second.val;
            int sum = firstDigit + secondDigit + prev;

            runner.next = new Node(sum % 10);
            runner = runner.next;

            first = first == null ? null : first.next;
            second = second == null ? null : second.next;

            prev = sum / 10;
        }

        return result.next;
    }
}
