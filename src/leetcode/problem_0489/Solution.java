package leetcode.problem_0489;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    private static final int UP = 0;
    private static final int RIGHT = 1;
    private static final int DOWN = 2;
    private static final int LEFT = 3;

    public void cleanRoom(Robot robot) {
        cleanRoomHelper(robot, new Position(0, 0), UP, new HashSet<>());
    }

    private void cleanRoomHelper(final Robot robot, final Position position, final int direction, final Set<Position> visited) {
        visited.add(position);
        robot.clean();

        for (int i = 0; i < 4; i++) {
            final int newDirection = (i + direction) % 4;
            final Position newPosition = computeNewPosition(position, newDirection);
            if (!visited.contains(newPosition) && robot.move()) {
                cleanRoomHelper(robot, newPosition, newDirection, visited);
                undoMoves(robot);
            }
            robot.turnRight();
        }
    }

    private Position computeNewPosition(final Position previousPosition, final int direction) {
        int dx = 0;
        int dy = 0;
        switch (direction) {
            case UP:
                dx = -1;
                break;
            case DOWN:
                dx = 1;
                break;
            case RIGHT:
                dy = 1;
                break;
            case LEFT:
                dy = -1;
                break;
        }
        return new Position(previousPosition.x + dx, previousPosition.y + dy);
    }

    private void undoMoves(final Robot robot) {
        robot.turnRight();
        robot.turnRight();
        robot.move();
        robot.turnRight();
        robot.turnRight();
    }

    static class Position {
        final int x;
        final int y;

        Position(final int x, final int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int hashCode() {
            return x * 13 + y;
        }

        @Override
        public boolean equals(Object object) {
            if (object instanceof Position) {
                final Position other = (Position) object;
                return x == other.x && y == other.y;
            }
            return false;
        }
    }

    interface Robot {
        // Returns true if the cell in front is open and robot moves into the cell.
        // Returns false if the cell in front is blocked and robot stays in the current cell.
        public boolean move();

        // Robot will stay in the same cell after calling turnLeft/turnRight.
        // Each turn will be 90 degrees.
        public void turnLeft();

        public void turnRight();

        // Clean the current cell.
        public void clean();
    }
}
