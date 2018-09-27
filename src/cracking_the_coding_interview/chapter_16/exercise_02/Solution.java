package cracking_the_coding_interview.chapter_16.exercise_02;

class Solution {

    int wordFrequencies(final String word, final String[] book) {
        if (word == null || book == null) {
            return 0;
        }

        final String trimmerLowercaseWord = word.trim().toLowerCase();
        int count = 0;
        for (String w : book) {
            if (trimmerLowercaseWord.equals(w.trim().toLowerCase())) {
                count++;
            }
        }
        return count;
    }
}
