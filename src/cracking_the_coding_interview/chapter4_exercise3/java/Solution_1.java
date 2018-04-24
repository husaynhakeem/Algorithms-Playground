package cracking_the_coding_interview.chapter4_exercise3.java;

import Utilities.java.GraphUtils.TreeNode;

import java.util.*;

public class Solution_1 {

    public static void main(String[] args) {
        TreeNode one = new TreeNode(1);
        TreeNode two = new TreeNode(2);
        TreeNode three = new TreeNode(3);
        TreeNode four = new TreeNode(4);
        TreeNode five = new TreeNode(5);
        TreeNode six = new TreeNode(6);
        TreeNode seven = new TreeNode(7);
        TreeNode eight = new TreeNode(8);
        TreeNode nine = new TreeNode(9);

        five.left = two;
        five.right = seven;

        two.left = one;
        two.right = three;

        three.right = four;

        seven.left = six;
        seven.right = eight;

        eight.right = nine;

        List<LinkedList<TreeNode>> result = getListOfTreeNodes(five);
        System.out.println("Depth: " + result.size());
        for (int i = 0; i < result.size(); i++) {
            LinkedList<TreeNode> nodesForDepth = result.get(i);
            System.out.println("Depth: " + (i + 1) + ", nodes: " + nodesForDepth);
        }
    }

    private static List<LinkedList<TreeNode>> getListOfTreeNodes(TreeNode root) {
        List<LinkedList<TreeNode>> list = new ArrayList<>();
        populateTreeNodesListForDepth(list, 0, root);
        return list;
    }

    private static void populateTreeNodesListForDepth(List<LinkedList<TreeNode>> list, int depth, TreeNode node) {
        if (node == null)
            return;

        if (list.size() == depth)
            list.add(depth, new LinkedList<>());

        populateTreeNodesListForDepth(list, depth + 1, node.left);

        LinkedList<TreeNode> depthNodesList = list.get(depth);
        depthNodesList.addLast(node);

        populateTreeNodesListForDepth(list, depth + 1, node.right);
    }
}
