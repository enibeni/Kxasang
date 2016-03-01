package Lesson01;

/**
 * Created by enibeni on 01.03.16.
 */
public class Main {
    public static void main(String[] args) {
        TrafficLight tf = new TrafficLight(Integer.parseInt(args[0]),
                Integer.parseInt(args[1]),
                Integer.parseInt(args[2]));
        tf.light();
    }
}
