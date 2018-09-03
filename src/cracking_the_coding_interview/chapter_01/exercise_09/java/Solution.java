package cracking_the_coding_interview.chapter_01.exercise_09.java;

import org.jetbrains.annotations.NotNull;

class Solution {

    boolean isRotation(@NotNull String first, @NotNull String second) {
        return isSubstring(first + first, second);
    }

    private boolean isSubstring(String first, String second) {
        return first.contains(second);
    }
}
