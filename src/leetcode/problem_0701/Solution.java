package leetcode.problem_0701;

import Utilities.java.TreeUtils.Node;

public class Solution {

    Node insertIntoBST(final Node root, final int val) {
        if (root == null) {
            return new Node(val);
        }
        insertIntoBSTHelper(root, val);
        return root;
    }

    private void insertIntoBSTHelper(final Node node, final int val) {
        if (node.val < val) {
            if (node.right == null) {
                node.right = new Node(val);
            } else {
                insertIntoBSTHelper(node.right, val);
            }
        } else {
            if (node.left == null) {
                node.left = new Node(val);
            } else {
                insertIntoBSTHelper(node.left, val);
            }
        }
    }
}
