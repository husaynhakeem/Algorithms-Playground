package chapter8_exercise2.java;

import java.util.ArrayList;
import java.util.List;

public class Solution_1 {

    public static void main(String[] args) {
        Cell[][] cells = new Cell[3][3];
        cells[0][0] = new Cell(0, 0, 0);
        cells[0][1] = new Cell(-1, 0, 1);
        cells[0][2] = new Cell(-1, 0, 2);
        cells[1][0] = new Cell(0, 1, 0);
        cells[1][1] = new Cell(0, 1, 1);
        cells[1][2] = new Cell(0, 1, 2);
        cells[2][0] = new Cell(0, 2, 0);
        cells[2][1] = new Cell(-1, 2, 1);
        cells[2][2] = new Cell(0, 2, 2);

        CellsGrid grid = new CellsGrid(cells);

        List<Cell> route = findRouteFromLeftUpperCornerToRightBottomCorner(grid);

        if (route == null || route.size() == 0)
            System.out.println("No route found");
        else
            for (Cell cell : route) {
                System.out.println(cell.x + ", " + cell.y);
            }
    }

    private static List<Cell> findRouteFromLeftUpperCornerToRightBottomCorner(CellsGrid grid) {
        if (grid.rowsSize() == 0 || grid.columnsSize() == 0)
            return null;

        List<Cell> route = new ArrayList<>();
        findRouteFromLeftUpperCornerToRightBottomCorner(grid, grid.cells[0][0], route);

        return route;
    }

    private static boolean findRouteFromLeftUpperCornerToRightBottomCorner(CellsGrid grid, Cell cell, List<Cell> route) {
        if (cell == null || cell.visited || cell.value == -1)
            return false;

        route.add(cell);

        Cell cellToRight = grid.cellToRightOf(cell);
        Cell cellToBottom = grid.cellToBottomOf(cell);

        if (cellToRight == null && cellToBottom == null)
            return true;

        if (findRouteFromLeftUpperCornerToRightBottomCorner(grid, cellToRight, route))
            return true;

        if (findRouteFromLeftUpperCornerToRightBottomCorner(grid, cellToBottom, route))
            return true;

        route.remove(cell);
        return false;
    }

    private static class CellsGrid {
        Cell[][] cells;

        CellsGrid(Cell[][] cells) {
            this.cells = cells;
        }

        int rowsSize() {
            if (cells.length > 0)
                return cells[0].length;
            return 0;
        }

        int columnsSize() {
            return cells.length;
        }

        Cell cellToRightOf(Cell cell) {
            if (cells.length > 0 && cell.x < cells[0].length - 1)
                return cells[cell.x + 1][cell.y];
            return null;
        }

        Cell cellToBottomOf(Cell cell) {
            if (cells.length > 0 && cell.y < cells.length - 1)
                return cells[cell.x][cell.y + 1];
            return null;
        }
    }

    private static class Cell {
        int value;
        int x;
        int y;
        boolean visited = false;

        Cell(int value, int x, int y) {
            this.value = value;
            this.x = x;
            this.y = y;
        }
    }
}
