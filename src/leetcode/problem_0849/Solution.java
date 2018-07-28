package leetcode.problem_0849;

class Solution {

    int maxDistToClosest(int[] seats) {
        int max = 0;
        for (int i = 0; i < seats.length; i++) {
            if (seats[i] == 0) {
                int contiguousZerosCount = numberOfContiguousZeros(seats, i);
                if ((i > 0 && seats[i - 1] == 1) &&
                        (i + contiguousZerosCount + 1 < seats.length && seats[i + contiguousZerosCount + 1] == 1)) {
                    max = Math.max(max, 1 + contiguousZerosCount / 2);
                } else {
                    max = Math.max(max, contiguousZerosCount + 1);
                }
                i += contiguousZerosCount + 1;
            }
        }
        return max;
    }

    private int numberOfContiguousZeros(int[] array, int startIndex) {
        int counter = 0;
        int i = startIndex + 1;

        while (i < array.length && array[i] == 0) {
            counter++;
            i++;
        }

        return counter;
    }
}
