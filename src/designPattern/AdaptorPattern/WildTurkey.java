package designPattern.AdaptorPattern;

public class WildTurkey implements Turkey{
    public void gobble() {
        System.out.println("골골");
    }

    public void fly() {
        System.out.println("짧은 거리를 날고 있어요! ");
    }
}
