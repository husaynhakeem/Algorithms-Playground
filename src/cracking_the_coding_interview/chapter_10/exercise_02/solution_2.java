package cracking_the_coding_interview.chapter_10.exercise_02;

import java.util.*;

import static Utilities.java.ArrayUtils.printArray;

public class solution_2 {

    public static void main(String[] args) {
        String[] words = new String[]{"care", "school", "univinu", "madam", "race", "soolhc", "acre"};
        groupAnagrams(words);
        printArray(words);
    }

    private static void groupAnagrams(String[] array) {
        Arrays.sort(array, new AnagramComparator());
    }

    private static class AnagramComparator implements Comparator<String> {

        private String sortChars(String s) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            return new String(chars);
        }

        @Override
        public int compare(String s1, String s2) {
            return sortChars(s1).compareTo(sortChars(s2));
        }
    }
}
