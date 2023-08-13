package designPattern.StrategyPattern.ActionGame;

public abstract class Character {
    WeaponBehavior weapon;

    public Character(){}

    public abstract void fight();

    public void setWeapon(WeaponBehavior wp) {
        weapon = wp;
    }

    public void WeaponCall() {
        weapon.useWeapon();
    }
}
