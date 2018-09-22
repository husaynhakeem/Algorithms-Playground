package cracking_the_coding_interview.chapter_08.exercise_02;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution_3 {

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

        Coordinates right() {
            return new Coordinates(line, column + 1);
        }

        Coordinates bottom() {
            return new Coordinates(line + 1, column);
        }

        boolean isLeftMostBottomCell() {
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
        final List<Coordinates> result = new ArrayList<>();
        robotInGrid(grid, lines, columns, grid[0][0], result);
        Collections.reverse(result);
        return result;
    }

    private boolean robotInGrid(@NotNull final Coordinates[][] grid, final int lines, final int columns, final Coordinates origin, final List<Coordinates> result) {
        if (origin.line == lines - 1 && origin.column == columns - 1) {
            result.add(origin);
            return true;
        }

        final Coordinates right = origin.right();
        if (right.column < columns && !grid[right.line][right.column].isOffLimits) {
            final boolean isValidRoute = robotInGrid(grid, lines, columns, right, result);
            if (isValidRoute) {
                result.add(origin);
                return true;
            }
        }

        final Coordinates bottom = origin.bottom();
        if (bottom.line < lines && !grid[bottom.line][bottom.column].isOffLimits) {
            final boolean isValidRoute = robotInGrid(grid, lines, columns, bottom, result);
            if (isValidRoute) {
                result.add(origin);
                return true;
            }
        }

        return false;
    }
}
