package Lesson04;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private static boolean endOfGame = false;
    private int countOfPlayers = 0;
    private List<Player> players = new ArrayList<>();

    public Game(int countOfPlayers) {
        this.countOfPlayers = countOfPlayers;
        for (int i = 1; i <= countOfPlayers; i++) {
            players.add(new Player("Игрок N" + i));
        }
    }

    boolean moveEnd = false;
    public void start() {
        while (!endOfGame) {
                for (int i = 0; i < players.size(); i++) {
                    moveEnd = false;
                    while (!moveEnd){
                    System.out.println(players.get(i).getName() + " ходит");
                    moveEnd = players.get(i).move();
                }
            }
        }
    }

    public static void setEndOfGame(boolean endOfGame) {
        Game.endOfGame = endOfGame;
    }
}
