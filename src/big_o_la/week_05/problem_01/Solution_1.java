package big_o_la.week_05.problem_01;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution_1 {

    static class QueenPosition {
        int row;
        int column;

        QueenPosition(int row, int column) {
            this.row = row;
            this.column = column;
        }

        @Override
        public int hashCode() {
            return new Integer(row).hashCode() + new Integer(column).hashCode();
        }

        @Override
        public boolean equals(Object obj) {
            if (!(obj instanceof QueenPosition)) {
                return false;
            }
            final QueenPosition otherPosition = (QueenPosition) obj;
            return row == otherPosition.row && column == otherPosition.column;
        }
    }

    static class QueenResult {
        List<QueenPosition> positions = new ArrayList<>();

        @Override
        public int hashCode() {
            int hashCode = 0;
            for (QueenPosition position : positions) {
                hashCode += position.hashCode();
            }
            return hashCode;
        }

        @Override
        public boolean equals(Object obj) {
            if (!(obj instanceof QueenResult)) {
                return false;
            }
            final QueenResult otherResult = (QueenResult) obj;
            return this.positions.size() == otherResult.positions.size() &&
                    this.positions.containsAll(otherResult.positions);
        }
    }

    List<QueenResult> nQueens(final int size) {
        final Set<QueenResult> results = new HashSet<>();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                nQueensHelper(size, i, j, results);
            }
        }

        return new ArrayList<>(results);
    }

    private void nQueensHelper(final int size, final int row, final int column, final Set<QueenResult> results) {
        final QueenResult result = new QueenResult();

        result.positions.add(new QueenPosition(row, column));

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (canPlaceQueen(i, j, result.positions)) {
                    result.positions.add(new QueenPosition(i, j));
                }
            }
        }

        if (result.positions.size() == size) {
            results.add(result);
        }
    }

    private boolean canPlaceQueen(final int row, final int column, final List<QueenPosition> takenQueenPositions) {
        for (QueenPosition queenPosition : takenQueenPositions) {
            if (queenPosition.row == row || queenPosition.column == column) {
                return false;
            }

            if (Math.abs(queenPosition.row - row) == Math.abs(queenPosition.column - column)) {
                return false;
            }
        }
        return true;
    }
}
