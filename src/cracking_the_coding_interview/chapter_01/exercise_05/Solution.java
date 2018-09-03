package cracking_the_coding_interview.chapter_01.exercise_05;

import org.jetbrains.annotations.NotNull;

public class Solution {

    boolean oneAway(@NotNull String a, @NotNull String b) {
        final int lengthA = a.length();
        final int lengthB = b.length();

        if (Math.abs(lengthA - lengthB) > 1) {
            return false;
        }

        if (lengthA == lengthB) {
            return onLengthsEqual(a, b);
        }

        final String longest = lengthA > lengthB ? a : b;
        final String shortest = lengthA > lengthB ? b : a;
        return onLengthsApartByOne(longest, shortest);
    }

    private boolean onLengthsApartByOne(String a, String b) {
        boolean foundEdit = false;
        int i = 0;
        int j = 0;

        while (i < a.length() && j < b.length()) {
            if (a.charAt(i) != b.charAt(j)) {
                if (foundEdit) {
                    return false;
                }
                foundEdit = true;
                i++;
            } else {
                i++;
                j++;
            }
        }
        return true;
    }

    private boolean onLengthsEqual(String a, String b) {
        boolean foundEdit = false;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                if (foundEdit)
                    return false;
                foundEdit = true;
            }
        }
        return true;
    }
}
