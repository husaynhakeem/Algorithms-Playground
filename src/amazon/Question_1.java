package amazon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Question_1 {

    List<String> retrieveMostFrequentlyUsedWords(String literatureText, List<String> wordsToExclude) {

        int maxFrequency = 0;
        HashMap<String, Integer> wordsMap = new HashMap<>();

        String[] words = literatureText.split(" ");

        for (String word: words) {

            if (wordsToExclude.contains(word))
                continue;

            Integer wordFrequency = wordsMap.get(word);
            if (wordFrequency == null)
                wordFrequency = 0;
            wordFrequency++;
            wordsMap.put(word, wordFrequency);

            if (wordFrequency > maxFrequency)
                maxFrequency = wordFrequency;
        }

        List<String> results = new ArrayList<>();
        for (Map.Entry<String, Integer> entry: wordsMap.entrySet()) {
            if (entry.getValue() == maxFrequency)
                results.add(entry.getKey());
        }

        return results;
    }
}
