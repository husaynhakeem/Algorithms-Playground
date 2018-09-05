package cracking_the_coding_interview.chapter_02.exercise_05;

class Solution_1 {

    static class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    Node sumLists(Node first, Node second, boolean reverse) {
        String strFirst = fromLinkedListToString(first);
        String strSecond = fromLinkedListToString(second);

        if (reverse) {
            strFirst = reverseString(strFirst);
            strSecond = reverseString(strSecond);
        }

        String strSum = (Integer.parseInt(strFirst) + Integer.parseInt(strSecond)) + "";

        if (reverse)
            strSum = reverseString(strSum);

        return fromStringToLinkedList(strSum);
    }

    private String fromLinkedListToString(Node root) {
        StringBuilder sb = new StringBuilder();

        while (root != null) {
            sb.append(root.val);
            root = root.next;
        }

        return sb.toString();
    }

    private Node fromStringToLinkedList(String input) {
        Node node = new Node(0);
        Node result = new Node(0);
        Node temp;
        boolean isRoot = true;

        for (Character c : input.toCharArray()) {
            if (!isDigit(c))
                throw new IllegalArgumentException("Input should only contain digits");

            temp = new Node(Integer.parseInt(c.toString()));

            if (isRoot) {
                node = temp;
                result = node;
                isRoot = false;
            } else {
                node.next = temp;
                node = node.next;
            }
        }

        return result;
    }

    private String reverseString(String input) {
        StringBuilder sb = new StringBuilder(input);
        sb = sb.reverse();
        return sb.toString();
    }

    private boolean isDigit(Character c) {
        return '0' <= c && c <= '9';
    }
}
