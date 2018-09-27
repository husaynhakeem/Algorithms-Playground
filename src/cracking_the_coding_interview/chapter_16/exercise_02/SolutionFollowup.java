package cracking_the_coding_interview.chapter_16.exercise_02;

import java.util.HashMap;
import java.util.Map;

class SolutionFollowup {

    int wordFrequencies(final String word, final String[] book) {
        if (word == null || book == null) {
            return 0;
        }
        Map<String, Integer> frequencyDictionary = buildWordFrequencies(book);
        String lowerCaseWord = word.trim().toLowerCase();
        if (frequencyDictionary.containsKey(lowerCaseWord))
            return frequencyDictionary.get(lowerCaseWord);
        return 0;
    }

    private Map<String, Integer> buildWordFrequencies(final String[] book) {
        final Map<String, Integer> frequencyDictionary = new HashMap<>();
        for (String word : book) {
            final String lowerCaseWord = word.trim().toLowerCase();
            if (frequencyDictionary.containsKey(lowerCaseWord)) {
                frequencyDictionary.put(lowerCaseWord, frequencyDictionary.get(lowerCaseWord) + 1);
            } else {
                frequencyDictionary.put(lowerCaseWord, 1);
            }
        }
        return frequencyDictionary;
    }
}
