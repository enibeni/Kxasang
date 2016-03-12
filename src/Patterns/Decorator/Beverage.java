package Patterns.Decorator;

/**
 * Created by s.morozov on 02.03.2016.
 */
public abstract class Beverage {
    String description = "Unknown Beverage";
    public String getDescription() {
        return description;
    }
    public abstract double cost();
}
