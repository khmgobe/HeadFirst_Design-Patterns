package designPattern.SimUduck;

public class MallardDuck extends Duck{

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("저는 물오리입니다");
    }

    public void type() {
        System.out.println("저는 물오리 타입입니다");
    }
}
