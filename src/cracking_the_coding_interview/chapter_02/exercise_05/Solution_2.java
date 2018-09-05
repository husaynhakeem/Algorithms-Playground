package cracking_the_coding_interview.chapter_02.exercise_05;

public class Solution_2 {

    static class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    Node sumLists(Node first, Node second) {
        return sumLists(first, second, 0);
    }

    private Node sumLists(Node first, Node second, int carry) {

        if (first == null && second == null && carry == 0)
            return null;

        Node root = new Node(0);

        if (first != null)
            root.val += first.val;

        if (second != null)
            root.val += second.val;

        root.val += carry;

        root.next = sumLists(
                (first == null) ? null : first.next,
                (second == null) ? null : second.next,
                (root.val >= 10) ? 1 : 0
        );

        root.val = root.val % 10;

        return root;
    }
}
