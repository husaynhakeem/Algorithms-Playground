package cracking_the_coding_interview.chapter_10.exercise_08;

import org.jetbrains.annotations.NotNull;

class Solution {

    void findDuplicates(@NotNull final int[] array) {
        // Could also use BitSet with size 32_000
        final byte[] bits = new byte[32_000];

        for (int i = 0; i < array.length; i++) {
            if (bits[array[i] - 1] == 1) {
                System.out.println(array[i]);
            } else {
                bits[array[i] - 1] = 1;
            }
        }
    }
}
