package cracking_the_coding_interview.chapter_02.exercise_06;

class Solution_1 {

    static class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    boolean isPalindrome(Node node) {
        Node reversedNode = reverseLinkedList(node);
        return compareLinkedLists(node, reversedNode);
    }

    private Node reverseLinkedList(Node node) {
        Node reversedNode = null;

        while (node != null) {
            Node temp = new Node(node.val);
            temp.next = reversedNode;
            reversedNode = temp;
            node = node.next;
        }

        return reversedNode;
    }

    private boolean compareLinkedLists(Node first, Node second) {
        while (first != null && second != null) {
            if (first.val != second.val)
                return false;
            first = first.next;
            second = second.next;
        }
        return first == null && second == null;
    }
}
