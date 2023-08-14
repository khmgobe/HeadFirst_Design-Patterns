package designPattern.DecoratorPattern;

public class Whip extends Beverage {
    public Whip(Beverage beverage2) {
        description = "휘핑크림!";
    }

    @Override
    public double cost() {
            return 1.34;
    }
}
