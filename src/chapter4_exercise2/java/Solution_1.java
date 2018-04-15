package chapter4_exercise2.java;

import Utilities.java.GraphUtils.TreeNode;
import static Utilities.java.GraphUtils.printTree;

public class Solution_1 {

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        printTree(fromArrayToBST(array));
    }

    private static TreeNode fromArrayToBST(int[] array) {
        return fromArrayToBST(array, 0, array.length - 1);
    }

    private static TreeNode fromArrayToBST(int[] array, int beginIndex, int endIndex) {
        if (endIndex < beginIndex)
            return null;

        int middleIndex = beginIndex + (endIndex - beginIndex) / 2;

        TreeNode node = new TreeNode(array[middleIndex]);
        node.left = fromArrayToBST(array, beginIndex, middleIndex - 1);
        node.right = fromArrayToBST(array, middleIndex + 1, endIndex);

        return node;
    }
}
