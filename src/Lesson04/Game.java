package Lesson04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Game {
    private List<String> userTownNames = new ArrayList<>();
    boolean quitIsNotPressed = true;
    public void start(){
        while (quitIsNotPressed) {
            String userEntry = enterTownName();
            if (userEntry.equals("quit")){
                quitIsNotPressed = false;
            }else if (isDuplicate(userEntry)){
                System.out.println("Такой город уже был!");
            }else if(isLastCharacterWrong(userEntry)){
                System.out.println("Не та первая буква!");
            }else{
                saveTown(userEntry);
            }
        }
        userTownNames.forEach(System.out::println);
    }

    public String enterTownName(){
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String userInput = "";
        try {
            userInput = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return userInput.toLowerCase();
    }

    public boolean isDuplicate(String currentTownName){
        return userTownNames.contains(currentTownName);
    }

    public boolean isLastCharacterWrong(String currentTownName){
        String previousTownName = "";
        if(userTownNames.size() == 0) {
            return false;
        }else{
            previousTownName = userTownNames.get(userTownNames.size() - 1);
            return currentTownName.charAt(0) != previousTownName.charAt(previousTownName.length() - 1);
        }
    }

    public void saveTown(String currentTownName){
        userTownNames.add(currentTownName);
    }
}
