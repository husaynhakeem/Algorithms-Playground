package mit_course_6006.lecture_2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {

    double computeDistance(String document1, String document2) {
        final Map<String, Integer> document1WordsAndFreqs = countWordFrequencies(splitDocIntoWords(document1));
        final Map<String, Integer> document2WordsAndFreqs = countWordFrequencies(splitDocIntoWords(document2));
        return computeDistanceInternal(document1WordsAndFreqs, document2WordsAndFreqs);
    }

    List<String> splitDocIntoWords(String document) {
        document = document.replaceAll("[^a-z|^A-Z|^0-9|^ ]", " ");
        final List<String> words = Arrays.asList(document.split("\\s+"));
        for (int i = 0; i < words.size(); i++) {
            words.set(i, words.get(i).toLowerCase());
        }
        return words;
    }

    Map<String, Integer> countWordFrequencies(List<String> words) {
        final HashMap<String, Integer> map = new HashMap<>();
        for (String word : words) {
            final int frequency = map.getOrDefault(word, 0);
            map.put(word, frequency + 1);
        }
        return map;
    }

    int countInnerProduct(Map<String, Integer> map1, Map<String, Integer> map2) {
        int sum = 0;
        for (String key1 : map1.keySet()) {
            for (String key2 : map2.keySet()) {
                if (key1.equals(key2)) {
                    sum += map1.get(key1) * map2.get(key2);
                }
            }
        }
        return sum;
    }

    double computeDistanceInternal(Map<String, Integer> wordsAndFreq1, Map<String, Integer> wordsAndFreq2) {
        final int numerator = countInnerProduct(wordsAndFreq1, wordsAndFreq2);
        final int denominator = countInnerProduct(wordsAndFreq1, wordsAndFreq1) * countInnerProduct(wordsAndFreq2, wordsAndFreq2);
        return Math.acos(numerator / Math.sqrt(denominator));
    }
}
