package cracking_the_coding_interview.chapter_16.exercise_22;

class Solution_1 {

    private static final int RIGHT = 0;
    private static final int LEFT = 1;
    private static final int UP = 2;
    private static final int DOWN = 3;

    static final boolean WHITE = true;
    static final boolean BLACK = false;

    private class Player {
        int row;
        int column;
        int direction;

        Player(final int row, final int column, final int direction) {
            this.row = row;
            this.column = column;
            this.direction = direction;
        }

        void move(final boolean[][] board) {
            final boolean color = board[row][column];
            board[row][column] = !color;
            if (color == WHITE) {
                switch (direction) {
                    case RIGHT:
                        direction = DOWN;
                        row++;
                        break;
                    case DOWN:
                        direction = LEFT;
                        column--;
                        break;
                    case LEFT:
                        direction = UP;
                        row--;
                        break;
                    case UP:
                        direction = RIGHT;
                        column++;
                        break;
                }
            } else {
                switch (direction) {
                    case RIGHT:
                        direction = UP;
                        row--;
                        break;
                    case UP:
                        direction = LEFT;
                        column--;
                        break;
                    case LEFT:
                        direction = DOWN;
                        row++;
                        break;
                    case DOWN:
                        direction = RIGHT;
                        column++;
                        break;
                }
            }
        }
    }

    boolean[][] langtonsAnt(final int k) {
        final boolean[][] board = initBoard(k);
        final Player player = new Player(k, k, RIGHT);
        for (int i = 0; i < k; i++) {
            player.move(board);
        }
        return board;
    }

    boolean[][] initBoard(final int k) {
        final int length = 2 * k + 1;
        final boolean[][] board = new boolean[length][length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                board[i][j] = WHITE;
            }
        }
        return board;
    }
}
