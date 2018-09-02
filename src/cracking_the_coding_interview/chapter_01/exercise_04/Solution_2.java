package cracking_the_coding_interview.chapter_01.exercise_04;

public class Solution_2 {

    public static void main(String[] args) {

        System.out.println(isPermutationOfPalindrome("Tact Coa"));
        System.out.println(isPermutationOfPalindrome("Taco cat"));
        System.out.println(isPermutationOfPalindrome("Atco cta"));
        System.out.println(isPermutationOfPalindrome("Atco ctt"));

    }

    private static boolean isPermutationOfPalindrome(String input) {
        int[] charsOccurrences = getCharsOccurrencesFrom(input);
        return checkMaxOddOccurrenceOne(charsOccurrences);
    }

    private static int[] getCharsOccurrencesFrom(String input) {
        int numericValueZ = Character.getNumericValue('z');
        int numericValueA = Character.getNumericValue('a');
        int[] charsOccurrences = new int[numericValueZ - numericValueA + 1];

        for (Character c : input.toLowerCase().toCharArray()) {
            if ('a' <= c && c < 'z') {
                charsOccurrences[Character.getNumericValue(c) - numericValueA]++;
            }
        }

        return charsOccurrences;
    }

    private static boolean checkMaxOddOccurrenceOne(int[] charsOccurrences) {
        boolean foundOdd = false;
        for (int i : charsOccurrences) {
            if (i % 2 == 1) {
                if (foundOdd)
                    return false;
                foundOdd = true;
            }
        }
        return true;
    }
}
