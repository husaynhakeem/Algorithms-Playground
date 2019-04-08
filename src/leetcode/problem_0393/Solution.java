package leetcode.problem_0393;

public class Solution {

    boolean validUtf8(int[] data) {
        boolean isContinuation = false;
        int continuationCount = 0;

        for (final int n : data) {
            final String binary = toBinary(n);
            final int onesCount = onesCount(binary);
            if (isContinuation) {
                if (onesCount != 1 || binary.charAt(1) != '0') {
                    return false;
                }
                continuationCount--;
                isContinuation = continuationCount != 0;
            } else {
                if (onesCount != 0) {
                    if (binary.charAt(onesCount) != '0') {
                        return false;
                    }
                    isContinuation = true;
                    continuationCount = onesCount - 1;
                }
            }
        }

        return !isContinuation;
    }

    private String toBinary(final int n) {
        String binary = Integer.toBinaryString(n);
        if (n <= 255) {
            return addZeros(binary);
        }
        return binary.substring(binary.length() - 8, binary.length());
    }

    private String addZeros(final String s) {
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 8 - s.length(); i++) {
            sb.append('0');
        }
        sb.append(s);
        return sb.toString();
    }

    private int onesCount(final String s) {
        int count = 0;

        while (count < 4 && s.charAt(count) == '1') {
            count++;
        }

        return count;
    }
}
