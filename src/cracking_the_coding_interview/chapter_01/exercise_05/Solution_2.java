package cracking_the_coding_interview.chapter_01.exercise_05;

import org.jetbrains.annotations.NotNull;

public class Solution_2 {

    boolean oneAway(@NotNull String a, @NotNull String b) {
        // If words are different in length by more than 1, return false
        if (Math.abs(a.length() - b.length()) > 1) {
            return false;
        }

        String shortest = a.length() < b.length() ? a : b;
        int shortIndex = 0;

        String longest = a.length() < b.length() ? b : a;
        int longIndex = 0;

        boolean foundDiff = false;
        boolean isReplace = a.length() == b.length();

        while (shortIndex < shortest.length()) {

            // If same character, increment both indices and continue
            if (shortest.charAt(shortIndex) == longest.charAt(longIndex)) {
                shortIndex++;
                longIndex++;
                continue;
            }

            // If different characters, and already found a diff, return false
            if (foundDiff) {
                return false;
            }

            // Advance in longest word, only advance in shortest word if not insertion/deletion case
            longIndex++;
            if (isReplace) {
                shortIndex++;
            }

            foundDiff = true;
        }

        return true;
    }
}
