package Patterns.Decorator;

/**
 * Created by s.morozov on 02.03.2016.
 */
public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return .20 + beverage.cost();
    }
}
