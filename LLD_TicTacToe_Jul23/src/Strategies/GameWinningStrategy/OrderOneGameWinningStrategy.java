package Strategies.GameWinningStrategy;

import Models.Board;
import Models.Move;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class OrderOneGameWinningStrategy
        implements GameWinningStrategy{
    // every row - a hashmap of symbol vs count
    List<HashMap<Character, Integer>> rowSymbolCounts =
            new ArrayList<>();
    // every col - a hashmap of symbol vs count
    List<HashMap<Character, Integer>> colSymbolCounts =
            new ArrayList<>();

    // every diag - a hashmap of symbol vs count
    HashMap<Character, Integer> topLeftDiaganolSymbolCounts =
            new HashMap<>();
    HashMap<Character, Integer> topRightDiaganolSymbolCounts =
            new HashMap<>();

    public OrderOneGameWinningStrategy(int dimension) {
        for (int i = 0; i < dimension; i++) {
            rowSymbolCounts.add(new HashMap<>());
            colSymbolCounts.add(new HashMap<>());
        }
    }

    private boolean isCellOnTopLeftDiagonal
            (int row, int col) {
        return row == col;
    }

    private boolean isCellOnTopRightDiagonal
            (int row, int col, int dimension) {
        return row + col == dimension - 1;
    }

    @Override
    public boolean checkWinner(Board board, Move move) {
        char symbol = move.getPlayer().getSymbol();
        int row = move.getCell().getRow();
        int col = move.getCell().getCol();
        int dimension = board.getBoard().size();

        if(!rowSymbolCounts.get(row).containsKey(symbol)) {
            rowSymbolCounts.get(row).put(symbol, 0);
        }
        rowSymbolCounts
                .get(row)
                .put(symbol,
                        rowSymbolCounts
                                .get(row)
                                .get(symbol) + 1);

        if (!colSymbolCounts.get(col).containsKey(symbol)) {
            colSymbolCounts.get(col).put(symbol, 0);
        }
        colSymbolCounts
                .get(col)
                .put(symbol,
                        colSymbolCounts
                                .get(col)
                                .get(symbol) + 1);

        if (isCellOnTopLeftDiagonal(row, col)) {
            if (!topLeftDiaganolSymbolCounts.containsKey(symbol)) {
                topLeftDiaganolSymbolCounts.put(symbol, 0);
            }
            topLeftDiaganolSymbolCounts
                    .put(symbol,
                            topLeftDiaganolSymbolCounts
                                    .get(symbol) + 1);
        }

        if (isCellOnTopRightDiagonal(row, col, dimension)) {
            if (!topRightDiaganolSymbolCounts.containsKey(symbol)) {
                topRightDiaganolSymbolCounts.put(symbol, 0);
            }
            topRightDiaganolSymbolCounts
                    .put(symbol,
                            topRightDiaganolSymbolCounts
                                    .get(symbol) + 1);
        }

        // check winner

        if (rowSymbolCounts.get(row).get(symbol) == dimension ||
                colSymbolCounts.get(col).get(symbol) == dimension) {
            return true;
        }
        if (isCellOnTopLeftDiagonal(row, col)
                && topLeftDiaganolSymbolCounts
                .get(symbol) == dimension) {
            return true;
        }

        if (isCellOnTopRightDiagonal(row, col, dimension)
                && topRightDiaganolSymbolCounts
                .get(symbol) == dimension) {
            return true;
        }

        return false;
    }
}
