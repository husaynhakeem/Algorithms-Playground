package chapter2_exercise5.java;

import Utilities.java.LinkedListUtils;
import Utilities.java.LinkedListUtils.*;

import static Utilities.java.LinkedListUtils.createLinkedListFrom;

/**
 * Created by husaynhakeem on 4/12/18.
 */
public class Solution_2 {

    public static void main(String[] args) {
        Node first = createLinkedListFrom(1, 2);
        Node second = createLinkedListFrom(3, 4, 5, 6);

        Node sum = sumLists(first, second);

        LinkedListUtils.printLinkedList(sum);
    }

    private static Node sumLists(Node first, Node second) {
        return sumLists(first, second, 0);
    }

    private static Node sumLists(Node first, Node second, int carry) {

        if (first == null && second == null && carry == 0)
            return null;

        Node root = new Node();

        if (first != null)
            root.data += first.data;

        if (second != null)
            root.data += second.data;

        root.data += carry;

        root.next = sumLists(
                (first == null) ? null : first.next,
                (second == null) ? null : second.next,
                (root.data >= 10) ? 1 : 0
        );

        root.data = root.data % 10;

        return root;
    }
}
