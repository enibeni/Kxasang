package Lesson04;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private Move move = new Move();
    private static List<String> userTownNames = new ArrayList<>();

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean move(){
        return move.move();
    }

    public static List<String> getUserTownNames() {
        return userTownNames;
    }

    public static void setUserTownNames(List<String> userTownNames) {
        Player.userTownNames = userTownNames;
    }
}
