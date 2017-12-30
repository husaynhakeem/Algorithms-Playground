package chapter1_exercise9;

/**
 * Created by husaynhakeem on 12/29/17.
 */
public class SolutionJava {

    public static void main(String[] args) {
        System.out.println(isRotation("waterbottle", "erbottlewat"));
    }

    private static boolean isRotation(String first, String second) {
        if (first == null || second == null || first.length() != second.length())
            return false;

        second = orderCharacters(first, second);
        return isSubstring(first, second);
    }

    /*
    Order the characters of 'second' in the same order as in 'first' character
    by character
     */
    private static String orderCharacters(String first, String second) {
        int sortingIndex = 0;
        for (char c: first.toCharArray()) {
            int index = second.lastIndexOf(c);
            if (index < 0)
                return second;
            second = swapCharacters(second, index, sortingIndex);
            System.out.println("Index: " + sortingIndex + ", text: " + second);
            sortingIndex++;
        }

        return second;
    }

    private static String swapCharacters(String text, int firstIndex, int secondIndex) {
        char temp = text.charAt(firstIndex);
        text = replaceCharacter(text, firstIndex, text.charAt(secondIndex));
        text = replaceCharacter(text, secondIndex, temp);
        return text;
    }

    private static String replaceCharacter(String text, int index, char c) {
        char[] chars = text.toCharArray();
        chars[index] = c;
        return String.valueOf(chars);
    }

    private static boolean isSubstring(String first, String second) {
        return first.contains(second);
    }
}
