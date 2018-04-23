package chapter16_exercise2.java;

import java.util.HashMap;
import java.util.Map;

public class Solution_2 {

    public static void main(String[] args) {
        String book = "Word frequencies\n" +
                "\n" +
                "Design a method to find the frequency of occurrences of any given word in a book. What if we were running this algorithm multiple times?";

        System.out.println(getFrequency("word", book));
    }

    private static int getFrequency(String word, String book) {
        if (word == null || book == null)
            return 0;

        Map<String, Integer> frequencyDictionary = getFrequencyDictionary(book);
        String lowerCaseWord = word.toLowerCase();
        if (frequencyDictionary.containsKey(lowerCaseWord))
            return frequencyDictionary.get(lowerCaseWord);
        return 0;
    }

    private static Map<String, Integer> getFrequencyDictionary(String book) {
        Map<String, Integer> frequencyDictionary = new HashMap<>();

        String[] wordsInBook = book.split(" ");
        for (String word : wordsInBook) {
            String lowerCaseWord = word.toLowerCase();
            if (frequencyDictionary.containsKey(lowerCaseWord))
                frequencyDictionary.put(lowerCaseWord, frequencyDictionary.get(word) + 1);
            else
                frequencyDictionary.put(lowerCaseWord, 1);
        }

        return frequencyDictionary;
    }
}
