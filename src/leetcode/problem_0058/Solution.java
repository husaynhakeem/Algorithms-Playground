package leetcode.problem_0058;

public class Solution {

    public int lengthOfLastWord(String s) {
        int count = 0;
        int index = s.length() - 1;

        while (index >= 0 && s.charAt(index) == ' ') {
            index--;
        }

        while (index >= 0 && s.charAt(index) != ' ') {
            index--;
            count++;
        }

        return count;
    }
}
