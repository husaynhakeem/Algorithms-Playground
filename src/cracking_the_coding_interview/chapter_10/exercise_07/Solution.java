package cracking_the_coding_interview.chapter_10.exercise_07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.BitSet;
import java.util.Scanner;

class Solution {

    int missingInt(final String fileName) throws FileNotFoundException {
        final Scanner scanner = new Scanner(new File(fileName));

        /*
        There are Math.pow(2, 32) possible integer values, half of them are
        positive, so that's Math.pow(2, 31) values, this is set as the size
        of the bit set, enabling it to map to each of those values.
         */
        final BitSet bitSet = new BitSet((int) Math.pow(2, 31));

        int n;
        while (scanner.hasNextInt()) {
            n = scanner.nextInt();
            bitSet.set(n, true);
        }

        int index = 0;
        while (!bitSet.get(index)) {
            index++;
        }
        return index;
    }
}
