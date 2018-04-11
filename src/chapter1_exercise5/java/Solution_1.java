package chapter1_exercise5.java;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by husaynhakeem on 4/10/18.
 */
public class Solution_1 {

    public static void main(String[] args) {

        System.out.println(areOneEditAway("pale", "ple"));
        System.out.println(areOneEditAway("pales", "pale"));
        System.out.println(areOneEditAway("pale", "bale"));
        System.out.println(areOneEditAway("pale", "bake"));

    }

    private static boolean areOneEditAway(String w1, String w2) {

        if (w1 == null || w2 == null)
            return false;

        if (w1.equals(w2))
            return true;

        int countDiff = w1.length() - w2.length();

        if (countDiff > 1)
            return false;
        else if (countDiff == 1)
            return areOneCountAndEditAway(w1, w2);
        else if (countDiff == 0)
            return areSameLengthAndOneEditAway(w1, w2);
        else if (countDiff == -1)
            return areOneCountAndEditAway(w2, w1);
        return false;
    }

    private static boolean areOneCountAndEditAway(String w1, String w2) {
        boolean foundEdit = false;
        for (int i = 0, j = 0; i < w1.length() && j < w2.length(); i++, j++) {
            if (w1.charAt(i) != w2.charAt(j)) {
                if (foundEdit)
                    return false;
                foundEdit = true;
                i++;
            }
        }
        return true;
    }

    private static boolean areSameLengthAndOneEditAway(String w1, String w2) {
        boolean foundEdit = false;
        for (int i = 0; i < w1.length(); i++) {
            if (w1.charAt(i) != w2.charAt(i)) {
                if (foundEdit)
                    return false;
                foundEdit = true;
            }
        }
        return true;
    }
}
