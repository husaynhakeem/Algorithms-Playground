package cracking_the_coding_interview.chapter_04.exercise_02;

import Utilities.java.TreeUtils.Node;

public class Solution {

    Node minimalTree(int[] array) {
        return minimalTree(array, 0, array.length - 1);
    }

    private Node minimalTree(int[] array, int beginIndex, int endIndex) {
        if (endIndex < beginIndex) {
            return null;
        }

        int middleIndex = beginIndex + (endIndex - beginIndex) / 2;

        Node node = new Node(array[middleIndex]);
        node.left = minimalTree(array, beginIndex, middleIndex - 1);
        node.right = minimalTree(array, middleIndex + 1, endIndex);

        return node;
    }
}
