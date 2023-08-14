package Models;

import java.util.LinkedList;
import java.util.List;

public class Board {
    private List<List<Cell>> cells;

    // 0,0
    // cells.get(0).get(0)
    // row = cells.size();
    // col = cells.get(0).size();

    public Board(int dimension) {
        this.cells = new LinkedList<>();
        for (int i = 0; i < dimension; i++) {
            this.cells.add(new LinkedList<>());
            for (int j = 0; j < dimension; j++) {
                this.cells.get(i).add(new Cell(i, j));
            }
        }
    }

    public List<List<Cell>> getBoard() {
        return cells;
    }

    public void setBoard(List<List<Cell>> cells) {
        this.cells = cells;
    }
}
