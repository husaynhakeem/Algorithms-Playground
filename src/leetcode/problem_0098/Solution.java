package leetcode.problem_0098;

import Utilities.java.TreeUtils.Node;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    boolean isValidBST(Node root) {
        final List<Integer> list = new ArrayList<>();
        inorder(root, list);

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i - 1) >= list.get(i)) {
                return false;
            }
        }

        return true;
    }

    private void inorder(final Node node, final List<Integer> list) {
        if (node != null) {
            inorder(node.left, list);
            list.add(node.val);
            inorder(node.right, list);
        }
    }
}
