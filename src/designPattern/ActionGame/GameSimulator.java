package designPattern.ActionGame;

public class GameSimulator {
    public static void main(String[] args) {
        Character game = new King();
        game.fight();
        game.setWeapon(new KnifeBehavior());
        game.WeaponCall();
    }
}
