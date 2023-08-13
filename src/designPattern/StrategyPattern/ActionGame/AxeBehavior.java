package designPattern.StrategyPattern.ActionGame;

public class AxeBehavior implements WeaponBehavior {
    public void useWeapon() {
        System.out.println("도끼로 마구 마구 베어버립니다.");
    }
}
