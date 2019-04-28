package leetcode.problem_0066;

public class Solution {

    int[] plusOne(int[] digits) {
        int index = digits.length - 1;
        int rest = 1;
        while (index >= 0) {
            final int value = (digits[index] + rest) % 10;
            rest = (digits[index] + rest) / 10;
            digits[index] = value;
            index--;
        }

        if (rest == 0) {
            return digits;
        }

        final int[] array = new int[digits.length + 1];
        array[0] = 1;
        for (int i = 0; i < digits.length; i++) {
            array[i + 1] = digits[i];
        }
        return array;
    }
}
