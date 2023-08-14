package designPattern.DecoratorPattern;



public abstract class Beverage {

    public int milkCost;
    public int soyCost;
    public int mochaCost;
    public int whipCost;
    public enum Size { TALL, GRANDE, VENTI };
    Size size = Size.TALL;

    public void setDescription(String description) {
        this.description = description;
    }

    public Size getSize() {
        return this.size;
    }


    String description = "제목 없음";

    public String getDescription() {
        return description;
    }
    public abstract double cost();
}
