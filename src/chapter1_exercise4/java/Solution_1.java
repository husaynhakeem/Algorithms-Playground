package chapter1_exercise4.java;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by husaynhakeem on 4/10/18.
 */
public class Solution_1 {

    public static void main(String[] args) {

        System.out.println(isPermutationOfPalindrome("Tact Coa"));
        System.out.println(isPermutationOfPalindrome("Taco cat"));
        System.out.println(isPermutationOfPalindrome("Atco cta"));
        System.out.println(isPermutationOfPalindrome("Atco ctt"));

    }

    private static boolean isPermutationOfPalindrome(String input) {

        if (input == null)
            return false;

        if (input.length() == 1)
            return true;

        HashMap<Character, Integer> occurrencesDictionary = new HashMap<>();

        for (Character c : input.toLowerCase().toCharArray()) {
            if (c != ' ')
                occurrencesDictionary.put(c, occurrencesDictionary.getOrDefault(c, 0) + 1);
        }

        boolean dictionaryContainsOddOccurrence = false;

        for (Map.Entry<Character, Integer> entry : occurrencesDictionary.entrySet()) {
            if (entry.getValue() % 2 == 1) {
                if (dictionaryContainsOddOccurrence)
                    return false;
                dictionaryContainsOddOccurrence = true;
            }
        }

        return true;
    }
}
