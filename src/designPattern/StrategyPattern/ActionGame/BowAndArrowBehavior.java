package designPattern.StrategyPattern.ActionGame;

public class BowAndArrowBehavior implements WeaponBehavior {
    public void useWeapon() {
        System.out.println("화살로 적을 정조준하여 무자비하게 쏩니다.");
    }
}
