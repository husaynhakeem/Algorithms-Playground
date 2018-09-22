package cracking_the_coding_interview.chapter_08.exercise_02;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

class Solution_1 {

    static class Coordinates {

        final int line;
        final int column;
        final boolean isOffLimits;

        Coordinates(int line, int column) {
            this.line = line;
            this.column = column;
            this.isOffLimits = false;
        }

        Coordinates(int line, int column, boolean isOffLimits) {
            this.line = line;
            this.column = column;
            this.isOffLimits = isOffLimits;
        }

        Coordinates left() {
            return new Coordinates(line, column - 1);
        }

        Coordinates top() {
            return new Coordinates(line - 1, column);
        }

        boolean isOrigin() {
            return line == 0 && column == 0;
        }

        @Override
        public boolean equals(Object obj) {
            if (!(obj instanceof Coordinates)) {
                return false;
            }
            final Coordinates coordinatesObj = (Coordinates) obj;
            return line == coordinatesObj.line && column == coordinatesObj.column;
        }
    }

    List<Coordinates> robotInGrid(@NotNull Coordinates[][] grid) {
        final int lines = grid.length;
        final int columns = grid[0].length;
        final Stack<Coordinates> result = new Stack<>();
        robotInGrid(grid, grid[lines - 1][columns - 1], result);
        return Arrays.asList(result.toArray(new Coordinates[result.size()]));
    }

    private boolean robotInGrid(@NotNull Coordinates[][] grid, @NotNull final Coordinates destination, final Stack<Coordinates> result) {
        if (destination.isOrigin()) {
            result.push(destination);
            return true;
        }

        final Coordinates top = destination.top();
        if (top.line >= 0 && !grid[top.line][top.column].isOffLimits) {
            final boolean isValidRoute = robotInGrid(grid, top, result);
            if (isValidRoute) {
                result.push(destination);
                return true;
            }
        }

        final Coordinates left = destination.left();
        if (left.column >= 0 && !grid[left.line][left.column].isOffLimits) {
            final boolean isValidRoute = robotInGrid(grid, left, result);
            if (isValidRoute) {
                result.push(destination);
                return true;
            }
        }

        return false;
    }
}
