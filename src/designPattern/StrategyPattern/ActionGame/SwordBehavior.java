package designPattern.StrategyPattern.ActionGame;

public class SwordBehavior implements WeaponBehavior {
    public void useWeapon() {
        System.out.println("신성한 검을 마구 휘두릅니다.");
    }
}
