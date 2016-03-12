package Patterns.Decorator;


public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "darkroast";
    }

    @Override
    public double cost() {
        return 1.19;
    }
}
