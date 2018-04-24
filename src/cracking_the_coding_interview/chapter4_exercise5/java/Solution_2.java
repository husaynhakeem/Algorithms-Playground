package cracking_the_coding_interview.chapter4_exercise5.java;

import Utilities.java.GraphUtils.TreeNode;

public class Solution_2 {

    public static void main(String[] args) {
        TreeNode validBST = getValidBST();
        System.out.println(checkBST(validBST, 9));

        TreeNode invalidBST = getInvalidBST();
        System.out.println(checkBST(invalidBST, 9));
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

    private static boolean checkBST(TreeNode node, int size) {
        int[] array = copyBSTToArray(node, size);
        for (int i = 1; i < size; i++) {
            if (array[i] <= array[i - 1])
                return false;
        }
        return true;
    }

    private static int[] copyBSTToArray(TreeNode node, int size) {
        index = 0;
        int[] array = new int[size];
        copyBSTToArray(node, array);
        return array;
    }

    private static int index = 0;

    private static void copyBSTToArray(TreeNode node, int[] array) {
        if (node == null)
            return;

        copyBSTToArray(node.left, array);
        array[index++] = node.data;
        copyBSTToArray(node.right, array);
    }
}
