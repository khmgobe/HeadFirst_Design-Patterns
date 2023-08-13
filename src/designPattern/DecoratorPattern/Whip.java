package designPattern.DecoratorPattern;

public class Whip extends Beverage {
    public Whip(Beverage beverage2) {
        super();
    }

    @Override
    public double cost() {
            return .34;
    }
}
