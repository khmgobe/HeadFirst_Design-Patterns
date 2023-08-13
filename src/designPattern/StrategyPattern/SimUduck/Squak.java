package designPattern.StrategyPattern.SimUduck;

public class Squak implements QuackBehavior{
    public void quack() {
        System.out.println("삑");
    }
}
