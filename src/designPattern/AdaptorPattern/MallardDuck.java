package designPattern.AdaptorPattern;

public class MallardDuck implements Duck {

    public void quack() {
        System.out.println("꽥");
    }

    public void fly() {
        System.out.println("날고 있어요!!");
    }
}
