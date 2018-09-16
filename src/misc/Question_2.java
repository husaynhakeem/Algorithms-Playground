package misc;

import java.util.*;

public class Question_2 {

    public static void main(String[] args) {

        List<String> lines = new ArrayList<>();
        lines.add("mi2 jog mid pet");
        lines.add("wz3 34 54 398");
        lines.add("a1 alps cow bar");
        lines.add("x4 45 21 7");

        List<String> result = reorderLines(4, lines);

        for (String line : result)
            System.out.println(line);
    }

    public static List<String> reorderLines(int logFileSize, List<String> logfile) {

        List<String> numericLines = new ArrayList<>();
        List<String> alphaNumericLines = new ArrayList<>();

        int numericIndex = 0;
        int alphaNumericIndex = 0;

        for (String line : logfile) {
            if (isNumeric(line))
                numericLines.add(numericIndex++, line);
            else
                alphaNumericLines.add(alphaNumericIndex++, line);
        }

        alphaNumericLines.sort(new LinesComparator());

        List<String> result = new ArrayList<>(alphaNumericLines);
        result.addAll(numericLines);

        return result;
    }

    private static boolean isNumeric(String line) {
        String[] words = line.split(" ");

        for (int i = 1; i < words.length; i++) {
            if (!onlyContainsDigits(words[i]))
                return false;
        }

        return true;
    }

    private static boolean onlyContainsDigits(String s) {
        try {
            int temp = Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static class LinesComparator implements Comparator<String> {

        @Override
        public int compare(String s1, String s2) {
            String word1 = s1.substring(s1.indexOf(" "));
            String word2 = s2.substring(s2.indexOf(" "));

            int result = word1.toLowerCase().compareTo(word2.toLowerCase());

            if (result == 0) {
                String id1 = s1.substring(0, s1.indexOf(" "));
                String id2 = s2.substring(0, s2.indexOf(" "));
                return id1.toLowerCase().compareTo(id2.toLowerCase());
            }

            return result;
        }
    }
}
