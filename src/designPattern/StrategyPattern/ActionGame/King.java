package designPattern.StrategyPattern.ActionGame;

public class King extends Character{
    public void fight() {
        System.out.println("근엄한 왕 답게 싸웁니다.");
    }
    public King() {
        weapon = new SwordBehavior();
    }
}
