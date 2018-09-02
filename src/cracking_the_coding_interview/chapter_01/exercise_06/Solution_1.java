package cracking_the_coding_interview.chapter_01.exercise_06;

public class Solution_1 {

    public static void main(String[] args) {

        assert "a2b1c5a3".equals(compressString("aabcccccaaa"));
        assert "abcdefg".equals(compressString("abcdefg"));

        System.out.println(compressString("aabcccccaaa"));
        System.out.println(compressString("abcdefg"));
    }

    private static String compressString(String input) {
        int[] charCounts = getCharCountsFrom(input);
        String compressedString = buildCompressedString(input, charCounts);

        if (compressedString.length() >= input.length())
            return input;
        return compressedString;
    }

    private static int[] getCharCountsFrom(String input) {
        int[] charCounts = new int[input.length()];

        int charCountsIndex = -1;
        Character previousCharacter = ' ';

        for (Character c : input.toCharArray()) {
            if (c != previousCharacter) {
                charCountsIndex++;
                previousCharacter = c;
            }
            charCounts[charCountsIndex]++;
        }

        return charCounts;
    }

    private static String buildCompressedString(String input, int[] charCounts) {
        int index = 0;
        StringBuilder compressedStringBuilder = new StringBuilder();

        for (int charCount : charCounts) {
            if (charCount == 0)
                break;
            compressedStringBuilder.append(input.charAt(index)).append(charCount);
            index += charCount;
        }

        return compressedStringBuilder.toString();
    }
}
