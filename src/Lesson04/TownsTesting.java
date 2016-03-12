package Lesson04;

import org.junit.Test;

import static junit.framework.Assert.assertTrue;

public class TownsTesting {
    public static void main(String[] args) {
        new Game(2).start();
    }

    @Test
    public void dublicate() {
        Move move = new Move();
        move.saveTown("Moscow");
        move.saveTown("London");
        move.saveTown("Tokyo");
        assertTrue("Дубликат", move.isDuplicate("Moscow"));
    }

    @Test
    public void wrongLetter(){
        Move move = new Move();
        move.saveTown("Moscow");
        assertTrue("Неверная первая буква", move.isLastCharacterWrong("Kursk"));
    }

}

