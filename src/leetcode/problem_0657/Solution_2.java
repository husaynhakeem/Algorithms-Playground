package leetcode.problem_0657;

class Solution_2 {

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
