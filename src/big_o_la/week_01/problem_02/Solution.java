package big_o_la.week_01.problem_02;

import org.jetbrains.annotations.NotNull;

class Solution {

    static class Node {
        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
        }
    }

    private class IntWrapper {
        int val;

        IntWrapper(int val) {
            this.val = val;
        }
    }

    Node mergeBSTs(@NotNull final Node a, final int sizeA, @NotNull final Node b, final int sizeB) {
        final int[] arrayA = convertTreeToArray(a, sizeA);
        final int[] arrayB = convertTreeToArray(b, sizeB);

        final int[] sumArray = sumArrays(arrayA, arrayB);

        return convertArrayToTree(sumArray);
    }

    private int[] convertTreeToArray(@NotNull final Node node, final int size) {
        final int[] array = new int[size];
        convertTreeToArrayHelper(node, array, new IntWrapper(0));
        return array;
    }

    private void convertTreeToArrayHelper(final Node node, final int[] array, final IntWrapper indexWrapper) {
        if (node != null) {
            convertTreeToArrayHelper(node.left, array, indexWrapper);
            array[indexWrapper.val++] = node.val;
            convertTreeToArrayHelper(node.right, array, indexWrapper);
        }
    }

    private int[] sumArrays(final int[] a, final int[] b) {
        final int[] c = new int[Math.max(a.length, b.length)];
        int indexA = 0, indexB = 0, indexC = 0;

        while (indexA < a.length || indexB < b.length) {
            final int elementA = indexA < a.length ? a[indexA++] : 0;
            final int elementB = indexB < b.length ? b[indexB++] : 0;
            c[indexC++] = elementA + elementB;
        }

        return c;
    }

    private Node convertArrayToTree(final int[] array) {
        return convertArrayToTreeHelper(array, 0, array.length - 1);
    }

    private Node convertArrayToTreeHelper(final int[] array, final int low, final int high) {
        if (low > high) {
            return null;
        }

        final int mid = low + (high - low) / 2;
        final Node node = new Node(array[mid]);
        node.left = convertArrayToTreeHelper(array, low, mid - 1);
        node.right = convertArrayToTreeHelper(array, mid + 1, high);

        return node;
    }
}
