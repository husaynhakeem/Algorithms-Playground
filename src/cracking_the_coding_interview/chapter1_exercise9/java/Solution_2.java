package cracking_the_coding_interview.chapter1_exercise9.java;

public class Solution_2 {

    public static void main(String[] args) {
        System.out.println(isRotation("waterbottle", "erbottlewat"));
    }

    private static boolean isRotation(String first, String second) {

        if (first == null || second == null || first.length() != second.length())
            return false;

        first = first + first;
        return isSubstring(first, second);
    }

    private static boolean isSubstring(String first, String second) {
        return first.contains(second);
    }
}
