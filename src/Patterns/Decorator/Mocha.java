package Patterns.Decorator;

/**
 * Created by s.morozov on 02.03.2016.
 */
public class Mocha extends CondimentDecorator {
    Beverage beverage;
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }
    public double cost() {
        return .20 + beverage.cost();
    }
}
