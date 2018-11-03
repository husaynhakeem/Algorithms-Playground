package leetcode.problem_0105;

import java.util.HashMap;
import java.util.Map;

class Solution {

    static class Node {
        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
        }
    }

    private class IntWithValue {
        int value;

        IntWithValue(int value) {
            this.value = value;
        }
    }

    Node constructBinaryTree(final int[] preArray, final int[] inArray) {
        final Map<Integer, Integer> inIndexMap = indicesMap(inArray);
        return constructBinaryTreeHelper(preArray, new IntWithValue(0), 0, inArray.length - 1, inIndexMap);
    }

    private Map<Integer, Integer> indicesMap(final int[] array) {
        final Map<Integer, Integer> indicesMap = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            indicesMap.put(array[i], i);
        }
        return indicesMap;
    }

    private Node constructBinaryTreeHelper(final int[] preArray, final IntWithValue preIndex, final int inStartIndex, final int inEndIndex, final Map<Integer, Integer> inIndexMap) {
        if (preIndex.value >= preArray.length || inStartIndex > inEndIndex) {
            preIndex.value -= 1;
            return null;
        }

        final int currentVal = preArray[preIndex.value];
        final Node currentNode = new Node(currentVal);
        final int currentValIndex = inIndexMap.get(currentVal);

        preIndex.value += 1;
        currentNode.left = constructBinaryTreeHelper(preArray, preIndex, inStartIndex, currentValIndex - 1, inIndexMap);

        preIndex.value += 1;
        currentNode.right = constructBinaryTreeHelper(preArray, preIndex, currentValIndex + 1, inEndIndex, inIndexMap);

        return currentNode;
    }
}
