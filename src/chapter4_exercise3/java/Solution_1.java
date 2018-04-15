package chapter4_exercise3.java;

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

        Map<Integer, LinkedList<TreeNode>> map = getListOfTreeNodes(five);
        System.out.println("Depth: " + map.size());
        for (Map.Entry<Integer, LinkedList<TreeNode>> nodesForDepth : map.entrySet()) {
            System.out.println("Depth: " + (nodesForDepth.getKey() + 1) + ", nodes: " + nodesForDepth.getValue());
        }
    }

    private static Map<Integer, LinkedList<TreeNode>> getListOfTreeNodes(TreeNode root) {
        Map<Integer, LinkedList<TreeNode>> map = new HashMap<>();
        populateTreeNodesListForDepth(map, 0, root);
        return map;
    }

    private static void populateTreeNodesListForDepth(Map<Integer, LinkedList<TreeNode>> map, int depth, TreeNode node) {
        if (node == null)
            return;

        populateTreeNodesListForDepth(map, depth + 1, node.left);

        LinkedList<TreeNode> depthNodesMap = map.getOrDefault(depth, new LinkedList<>());
        depthNodesMap.addLast(node);
        map.put(depth, depthNodesMap);

        populateTreeNodesListForDepth(map, depth + 1, node.right);
    }
}
