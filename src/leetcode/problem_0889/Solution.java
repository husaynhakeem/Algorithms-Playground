package leetcode.problem_0889;

import Utilities.java.TreeUtils.Node;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    Node constructFromPrePost(int[] pre, int[] post) {
        final Map<Integer, Integer> nodeValueToPostIndexMap = buildNodeValueToPostIndexMap(post);
        return constructFromPrePostHelper(pre, 0, pre.length - 1, post, 0, post.length - 1, nodeValueToPostIndexMap);
    }

    private Map<Integer, Integer> buildNodeValueToPostIndexMap(final int[] post) {
        final Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < post.length; i++) {
            map.put(post[i], i);
        }
        return map;
    }

    private Node constructFromPrePostHelper(final int[] pre, final int preStart, final int preEnd, final int[] post, final int postStart, final int postEnd, final Map<Integer, Integer> nodeValueToPostIndexMap) {
        if (preStart > preEnd) {
            return null;
        }

        if (preStart == preEnd) {
            return new Node(pre[preStart]);
        }

        final Node root = new Node(pre[preStart]);

        final int leftSubtreePostIndex = nodeValueToPostIndexMap.get(pre[preStart + 1]);
        final int leftSubtreeNumberOfElements = leftSubtreePostIndex - postStart;

        final Node left = constructFromPrePostHelper(pre, preStart + 1, preStart + leftSubtreeNumberOfElements + 1, post, postStart, leftSubtreePostIndex - 1, nodeValueToPostIndexMap);
        final Node right = constructFromPrePostHelper(pre, preStart + leftSubtreeNumberOfElements + 2, preEnd, post, leftSubtreePostIndex + 1, postEnd, nodeValueToPostIndexMap);

        root.left = left;
        root.right = right;
        return root;
    }
}
