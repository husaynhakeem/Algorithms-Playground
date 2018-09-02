package cracking_the_coding_interview.chapter_04.exercise_04;

import Utilities.java.GraphUtils.TreeNode;

public class Solution_1 {

    public static void main(String[] args) {
        TreeNode unbalancedRoot = getUnbalancedTreeNode();
        System.out.println(checkIfBalanced(unbalancedRoot));

        TreeNode balancedRoot = getBalancedTreeNode();
        System.out.println(checkIfBalanced(balancedRoot));
    }

    private static TreeNode getUnbalancedTreeNode() {
        TreeNode one = new TreeNode(1);
        TreeNode two = new TreeNode(2);
        TreeNode three = new TreeNode(3);
        TreeNode four = new TreeNode(4);
        TreeNode five = new TreeNode(5);
        TreeNode six = new TreeNode(6);
        TreeNode seven = new TreeNode(7);
        TreeNode eight = new TreeNode(8);
        TreeNode nine = new TreeNode(9);
        TreeNode ten = new TreeNode(10);
        TreeNode eleven = new TreeNode(11);

        six.left = one;
        six.right = two;

        seven.left = three;

        eight.left = four;

        nine.left = five;
        nine.right = six;

        ten.left = seven;
        ten.right = eight;

        eleven.left = nine;
        eleven.right = ten;

        return eleven;
    }

    private static TreeNode getBalancedTreeNode() {
        TreeNode one = new TreeNode(1);
        TreeNode two = new TreeNode(2);
        TreeNode three = new TreeNode(3);
        TreeNode four = new TreeNode(4);
        TreeNode five = new TreeNode(5);
        TreeNode six = new TreeNode(6);
        TreeNode seven = new TreeNode(7);
        TreeNode eight = new TreeNode(8);
        TreeNode nine = new TreeNode(9);
        TreeNode ten = new TreeNode(10);
        TreeNode eleven = new TreeNode(11);
        TreeNode twelve = new TreeNode(12);

        six.left = one;
        six.right = two;

        seven.left = three;

        eight.left = four;

        nine.left = five;

        ten.left = six;
        ten.right = seven;

        eleven.left = eight;
        eleven.right = nine;

        twelve.left = ten;
        twelve.right = eleven;

        return twelve;
    }

    private static boolean checkIfBalanced(TreeNode node) {
        if (node == null)
            return true;

        boolean currentLevelIsBalanced = Math.abs(numberOfNodesFrom(node.left) - numberOfNodesFrom(node.right)) <= 1;
        return currentLevelIsBalanced && checkIfBalanced(node.left) && checkIfBalanced(node.right);
    }

    private static int numberOfNodesFrom(TreeNode node) {
        if (node == null)
            return 0;
        return 1 + numberOfNodesFrom(node.left) + numberOfNodesFrom(node.right);
    }
}
