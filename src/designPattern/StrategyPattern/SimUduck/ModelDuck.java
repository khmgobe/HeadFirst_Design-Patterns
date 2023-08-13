package designPattern.StrategyPattern.SimUduck;

public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }
    public void display() {
        System.out.println("저는 모형 오리입니다");
    }

    public void type() {
        System.out.println("저는 모형 오리 타입입니다.");
    }
}
