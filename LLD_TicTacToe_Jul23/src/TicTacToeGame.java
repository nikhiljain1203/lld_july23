import Controller.GameController;
import Models.*;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TicTacToeGame {
    public static void main(String[] args) {
        System.out.println("Hello world!: Game Starting....");
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the dimension of the game : ");
        int dimension = scanner.nextInt();

        System.out.println("No of Players: ");
        int noOfPlayers = scanner.nextInt();

        List<Player> players = new LinkedList<>();

        System.out.println("Will there be any bot ? y/n");
        String isBot = scanner.next();
        if (isBot.equals("y")) { // y or n
            noOfPlayers = noOfPlayers - 1;// number of human players
            System.out.println("Enter the name of the Bot: ");
            String name = scanner.next();

            System.out.println("Enter the symbol of the Bot: ");
            String botSymbol = scanner.next();

            System.out.println("Enter Bot Diffculty level: 1-Easy 2-Med 3-Hard");
            int diffcultyLevel = scanner.nextInt();
            players.add(new Bot(botSymbol.charAt(0), name,
                    BotDifficultyLevel.fromValue(diffcultyLevel)));

        }

        for(int i = 0; i < noOfPlayers; i++) {
            System.out.println("What is the name of the player: " + (i+1));
            String name = scanner.next();

            System.out.println("What is the symbol for player: " + i+1);
            String symbol = scanner.next(); //Assumption : Single character.

            Player player = new Player(symbol.charAt(0), name, PlayerType.HUMAN);
            players.add(player);
        }

//        Game game = Game.getBuilder()
//                        .setDimension(dimension)
//                        .setPlayers(players)
//                        .build();

        GameController gameController = new GameController();
        Game game = gameController.createGame(dimension, players);
        gameController.setGameStatus(game, GameStatus.IN_PROGRESS);


        while(gameController.getGameStatus(game) ==
                GameStatus.IN_PROGRESS) {
            // players will be playing
            System.out.println("Current Board: ");
            gameController.displayBoard(game);

            System.out.println("Do you want to undo ? y/n");
            String input = scanner.next();

            if (input.equals("y")) {
                gameController.undo(game);
            } else {
                gameController.executeNextMove(game);
            }
        }

        if(gameController.getGameStatus(game) == GameStatus.ENDED) {
            // someone has won
            System.out.println("Winning Player: " +
                    gameController.getWinnerName(game));
        } else {
            System.out.println("Game has drawn");
        }
    }
}