package Strategies.BotPlayingStrategy;

import Models.Board;
import Models.Move;
import Models.Player;

public interface BotPlayingStrategy {
    Move decideMove(Player player, Board board);
}
