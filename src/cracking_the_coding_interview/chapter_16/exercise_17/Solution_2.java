package cracking_the_coding_interview.chapter_16.exercise_17;

class Solution_2 {

    int contiguousSequence(final int[] array) {
        int length = array.length;
        int maxSum = 0;
        int sum = 0;

        for (int i = 0; i < length; i++) {
            if (array[i] + sum >= 0) {
                sum += array[i];
            } else {
                sum = 0;
            }
            if (maxSum < sum) {
                maxSum = sum;
            }
        }

        return maxSum;
    }
}
