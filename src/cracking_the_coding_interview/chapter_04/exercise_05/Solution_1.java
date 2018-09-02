package cracking_the_coding_interview.chapter_04.exercise_05;

import Utilities.java.GraphUtils.TreeNode;

public class Solution_1 {

    public static void main(String[] args) {
        TreeNode validBST = getValidBST();
        System.out.println(checkBST(validBST));

        TreeNode invalidBST = getInvalidBST();
        System.out.println(checkBST(invalidBST));
    }

    private static TreeNode getValidBST() {
        TreeNode one = new TreeNode(1);
        TreeNode two = new TreeNode(2);
        TreeNode three = new TreeNode(3);
        TreeNode four = new TreeNode(4);
        TreeNode five = new TreeNode(5);
        TreeNode six = new TreeNode(6);
        TreeNode seven = new TreeNode(7);
        TreeNode eight = new TreeNode(8);
        TreeNode nine = new TreeNode(9);

        three.right = four;

        eight.right = nine;

        two.left = one;
        two.right = three;

        seven.left = six;
        seven.right = eight;

        five.left = two;
        five.right = seven;

        return five;
    }

    private static TreeNode getInvalidBST() {
        TreeNode one = new TreeNode(1);
        TreeNode two = new TreeNode(2);
        TreeNode three = new TreeNode(3);
        TreeNode four = new TreeNode(4);
        TreeNode five = new TreeNode(5);
        TreeNode six = new TreeNode(6);
        TreeNode seven = new TreeNode(7);
        TreeNode eight = new TreeNode(8);
        TreeNode nine = new TreeNode(9);

        three.right = four;

        eight.left = nine;

        two.left = one;
        two.right = three;

        seven.left = six;
        seven.right = eight;

        five.left = two;
        five.right = seven;

        return five;
    }

    private static boolean checkBST(TreeNode node) {
        return checkBST(node, null, null);
    }

    private static boolean checkBST(TreeNode node, Integer min, Integer max) {
        if (node == null)
            return true;

        if (min != null && node.data <= min)
            return false;

        if (max != null && node.data > max)
            return false;

        if (!checkBST(node.left, min, node.data) || !checkBST(node.right, node.data, max))
            return false;

        return true;
    }
}
