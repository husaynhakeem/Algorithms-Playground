package cracking_the_coding_interview.chapter10_exercise2.java;

import Utilities.java.ArrayUtils;

import java.util.*;

public class solution_1 {

    public static void main(String[] args) {
        String[] words = new String[]{"care", "school", "univinu", "madam", "race", "soolhc", "acre"};
        groupAnagrams(words);
        ArrayUtils.printArray(words);
    }

    private static void groupAnagrams(String[] array) {
        Map<String, List<String>> map = new HashMap<>();

        for (String s : array) {
            String key = sortChars(s);
            List<String> values = map.get(key);
            if (values == null)
                values = new ArrayList<>();
            values.add(s);
            map.put(key, values);
        }

        int index = 0;
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            for (String s : entry.getValue()) {
                array[index++] = s;
            }
        }
    }

    private static String sortChars(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
