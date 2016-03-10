package Lesson04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TownsTesting {
    public static void main(String[] args) {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        try {
            String userInput = bf.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        while (userInput)

    }
}
