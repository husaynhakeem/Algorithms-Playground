package cracking_the_coding_interview.chapter16_exercise2.java;

import java.util.Arrays;

public class Solution_1 {

    public static void main(String[] args) {
        String book = "Word frequencies\n" +
                "\n" +
                "Design a method to find the frequency of occurrences of any given word in a book. What if we were running this algorithm multiple times?";

        System.out.println(getFrequency("word", book));
    }

    private static int getFrequency(String word, String book) {
        if (word == null || book == null)
            return 0;

        String[] wordsInBook = book.split(" ");
        return (int) Arrays.stream(wordsInBook)
                .filter(word::equalsIgnoreCase)
                .count();
    }
}
