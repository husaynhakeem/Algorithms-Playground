package mit_course_6006.lecture_04.heap_sort;

class Solution {

    void sort(final int[] array) {
        if (array == null) {
            return;
        }

        buildMaxHeap(array);
        sortMaxHeap(array);
    }

    private void buildMaxHeap(final int[] array) {
        final int length = array.length;
        for (int i = length / 2 - 1; i >= 0; i--) {
            maxHeapify(array, i, length);
        }
    }

    private void sortMaxHeap(int[] array) {
        int maxHeapLength = array.length - 1;

        while (maxHeapLength > 0) {
            int temp = array[0];
            array[0] = array[maxHeapLength];
            array[maxHeapLength] = temp;

            maxHeapify(array, 0, maxHeapLength);

            maxHeapLength--;
        }
    }

    private void maxHeapify(int[] array, int index, int length) {
        final int leftIndex = 2 * index + 1;
        final int rightIndex = 2 * index + 2;
        int maxIndex = index;

        if (leftIndex < length && array[leftIndex] > array[maxIndex]) {
            maxIndex = leftIndex;
        }

        if (rightIndex < length && array[rightIndex] > array[maxIndex]) {
            maxIndex = rightIndex;
        }

        if (maxIndex != index) {
            int temp = array[index];
            array[index] = array[maxIndex];
            array[maxIndex] = temp;

            maxHeapify(array, maxIndex, length);
        }
    }
}
