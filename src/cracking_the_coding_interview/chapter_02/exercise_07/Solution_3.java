package cracking_the_coding_interview.chapter_02.exercise_07;

import org.jetbrains.annotations.NotNull;

class Solution_3 {

    static class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    Node intersection(@NotNull Node l1, @NotNull Node l2) {
        Node l1Runner = l1;
        int length1 = 1;
        while (l1Runner.next != null) {
            l1Runner = l1Runner.next;
            length1++;
        }

        Node l2Runner = l2;
        int length2 = 1;
        while (l2Runner.next != null) {
            l2Runner = l2Runner.next;
            length2++;
        }

        if (l1Runner != l2Runner) {
            return null;
        }

        Node shorter = length1 < length2 ? l1 : l2;
        Node longer = length1 < length2 ? l2 : l1;
        for (int i = 0; i < Math.abs(length1 - length2); i++) {
            longer = longer.next;
        }

        while (longer != shorter) {
            longer = longer.next;
            shorter = shorter.next;
        }

        return shorter;
    }
}
