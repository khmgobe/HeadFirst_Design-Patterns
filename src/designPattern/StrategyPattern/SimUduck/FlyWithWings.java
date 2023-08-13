package designPattern.StrategyPattern.SimUduck;

public class FlyWithWings implements FlyBehavior{
    public void fly() {
        //실제로 날 수 있는 오리들의 나는 행동을 구현한 클래스
        System.out.println("날고 있어요!!");
    }
}
