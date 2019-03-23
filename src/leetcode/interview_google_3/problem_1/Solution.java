package leetcode.interview_google_3.problem_1;

public class Solution {

    boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;
        for (Character c : moves.toCharArray()) {
            switch (c) {
                case 'U':
                    y++;
                    break;
                case 'D':
                    y--;
                    break;
                case 'L':
                    x--;
                    break;
                case 'R':
                    x++;
                    break;
            }
        }
        return x == 0 && y == 0;
    }
}
