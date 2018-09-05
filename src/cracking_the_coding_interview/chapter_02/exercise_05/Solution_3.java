package cracking_the_coding_interview.chapter_02.exercise_05;

import org.jetbrains.annotations.NotNull;

class Solution_3 {

    static class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    Node sumLists(@NotNull Node l1, @NotNull Node l2) {
        return reverseAndNodify(reverse(l1) + reverse(l2));
    }

    private int reverse(@NotNull Node node) {
        int counter = 0;
        int result = 0;
        while (node != null) {
            result += node.val *  Math.pow(10, counter++);
            node = node.next;
        }
        return result;
    }

    private Node reverseAndNodify(int n) {
        Node result = null;
        Node node = null;

        while (n != 0) {
            final int k = n % 10;
            Node temp = new Node(k);
            if (result != null) {
                node.next = temp;
                node = temp;
            } else {
                result = temp;
                node = temp;
            }
            n /= 10;
        }

        return result;
    }
}
