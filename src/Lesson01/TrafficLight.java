package Lesson01;

/**
 * Created by s.morozov on 26.02.2016.
 */

public class TrafficLight {
    private int greenTimer;
    private int yellowTimer;
    private int redTimer;
    private int cycle;

    public TrafficLight(int greenTimer, int yellowTimer, int redTimer) {
        this.greenTimer = greenTimer;
        this.yellowTimer = yellowTimer + greenTimer;
        this.redTimer = redTimer + yellowTimer;
        this.cycle = greenTimer + yellowTimer + redTimer;
    }

    public void light(){
        int seconds = 0;
        int minutes = 0;

        while (true){
            try {
                Thread.sleep(1000);
                seconds++;
                if (seconds == 60) {
                    seconds = 0;
                    minutes++;
                    if (minutes <= getGreenTimer()){
                        System.out.println("Green");
                    }else if(minutes <= getYellowTimer()){
                        System.out.println("Yellow");
                    }else{
                        System.out.println("Red");
                    }
                }
                if (minutes == cycle){
                    minutes = 0;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public int getGreenTimer() {
        return greenTimer;
    }

    public void setGreenTimer(int greenTimer) {
        this.greenTimer = greenTimer;
    }

    public int getYellowTimer() {
        return yellowTimer;
    }

    public void setYellowTimer(int yellowTimer) {
        this.yellowTimer = yellowTimer;
    }

    public int getRedTimer() {
        return redTimer;
    }

    public void setRedTimer(int redTimer) {
        this.redTimer = redTimer;
    }

    public static void main(String[] args) {
        TrafficLight tf = new TrafficLight(Integer.parseInt(args[0]),
                Integer.parseInt(args[1]),
                Integer.parseInt(args[2]));
        tf.light();
    }
}
