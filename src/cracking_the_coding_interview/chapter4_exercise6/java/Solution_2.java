package cracking_the_coding_interview.chapter4_exercise6.java;

import Utilities.java.GraphUtils.TreeNodeWithLinkToParent;

import java.util.ArrayList;
import java.util.List;

public class Solution_2 {

    public static void main(String[] args) {
        TreeNodeWithLinkToParent one = getBSTNode(1);
        TreeNodeWithLinkToParent two = getBSTNode(2);
        TreeNodeWithLinkToParent three = getBSTNode(3);
        TreeNodeWithLinkToParent four = getBSTNode(4);
        TreeNodeWithLinkToParent five = getBSTNode(5);
        TreeNodeWithLinkToParent six = getBSTNode(6);
        TreeNodeWithLinkToParent seven = getBSTNode(7);
        TreeNodeWithLinkToParent eight = getBSTNode(8);
        TreeNodeWithLinkToParent nine = getBSTNode(9);

        System.out.println(findSuccessor(one));
        System.out.println(findSuccessor(two));
        System.out.println(findSuccessor(three));
        System.out.println(findSuccessor(four));
        System.out.println(findSuccessor(five));
        System.out.println(findSuccessor(six));
        System.out.println(findSuccessor(seven));
        System.out.println(findSuccessor(eight));
        System.out.println(findSuccessor(nine));
    }

    private static TreeNodeWithLinkToParent getBSTNode(int index) {
        TreeNodeWithLinkToParent one = new TreeNodeWithLinkToParent(1);
        TreeNodeWithLinkToParent two = new TreeNodeWithLinkToParent(2);
        TreeNodeWithLinkToParent three = new TreeNodeWithLinkToParent(3);
        TreeNodeWithLinkToParent four = new TreeNodeWithLinkToParent(4);
        TreeNodeWithLinkToParent five = new TreeNodeWithLinkToParent(5);
        TreeNodeWithLinkToParent six = new TreeNodeWithLinkToParent(6);
        TreeNodeWithLinkToParent seven = new TreeNodeWithLinkToParent(7);
        TreeNodeWithLinkToParent eight = new TreeNodeWithLinkToParent(8);
        TreeNodeWithLinkToParent nine = new TreeNodeWithLinkToParent(9);

        // left and right
        three.right = four;
        eight.right = nine;
        two.left = one;
        two.right = three;
        seven.left = six;
        seven.right = eight;
        five.left = two;
        five.right = seven;

        // parent
        four.parent = three;
        nine.parent = eight;
        one.parent = two;
        three.parent = two;
        six.parent = seven;
        eight.parent = seven;
        two.parent = five;
        seven.parent = five;

        switch (index) {
            case 1:
                return one;
            case 2:
                return two;
            case 3:
                return three;
            case 4:
                return four;
            case 5:
                return five;
            case 6:
                return six;
            case 7:
                return seven;
            case 8:
                return eight;
            default:
                return nine;
        }
    }

    private static TreeNodeWithLinkToParent findSuccessor(TreeNodeWithLinkToParent node) {
        if (node == null)
            return null;

        if (node.right != null) {
            return leftMostChild(node);
        }

        TreeNodeWithLinkToParent current = node;
        TreeNodeWithLinkToParent parent = node.parent;

        while (parent != null && parent.right == current) {
            current = parent;
            parent = parent.parent;
        }

        return parent;
    }

    private static TreeNodeWithLinkToParent leftMostChild(TreeNodeWithLinkToParent node) {
        if (node == null)
            return null;

        while(node.left != null) {
            node = node.left;
        }

        return node;
    }
}
