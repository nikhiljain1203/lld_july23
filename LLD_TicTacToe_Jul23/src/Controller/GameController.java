package Controller;

import Models.Game;
import Models.GameStatus;
import Models.Player;

import java.util.List;

public class GameController {
    public Game createGame(int dimension, List<Player> players) {
        return Game.getBuilder()
                .setDimension(dimension)
                .setPlayers(players)
                .build();
    }

    public void undo(Game game) {

    }

    public void executeNextMove(Game game) {
        game.makeNextMove();
    }

    public GameStatus getGameStatus(Game game) {
        return game.getGameStatus();
    }

    public String getWinnerName(Game game) {
        return game.getWinner().getName();
    }

    public void displayBoard(Game game) {
        game.getBoard().displayBoard();
    }

    public void setGameStatus(Game game, GameStatus gameStatus) {
        game.setGameStatus(gameStatus);
    }
}
