package Lesson04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Move {

    boolean moveEnd = false;

    public boolean move() {
        String userEntry = enterTownName();
        moveEnd = false;
        if (userEntry.equals("quit")) {
            Game.setEndOfGame(true);
            moveEnd = true;
            System.out.println("Выход из игры");
        } else if (isDuplicate(userEntry)) {
            System.out.println("Такой город уже был!");
        } else if (isLastCharacterWrong(userEntry)) {
            System.out.println("Не та первая буква!");
        } else {
            saveTown(userEntry);
            moveEnd = true;
        }
        return moveEnd;
    }

    public String enterTownName() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String userInput = "";
        try {
            userInput = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return userInput.toLowerCase();
    }

    public boolean isDuplicate(String currentTownName) {
        return Player.getUserTownNames().contains(currentTownName);
    }

    public boolean isLastCharacterWrong(String currentTownName) {
        String previousTownName = "";
        if (Player.getUserTownNames().size() == 0) {
            return false;
        } else {
            previousTownName = Player.getUserTownNames().get(Player.getUserTownNames().size() - 1);
            return currentTownName.charAt(0) != previousTownName.charAt(previousTownName.length() - 1);
        }
    }

    public void saveTown(String currentTownName) {
        Player.getUserTownNames().add(currentTownName);
    }
}
