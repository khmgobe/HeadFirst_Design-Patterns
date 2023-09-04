package designPattern.IteratorPattern;

public class MenuItem {

    String anme;
    String descrption;
    boolean vegetarian;
    double price;

    public MenuItem(String anme, String descrption, boolean vegetarian, double price) {
        this.anme = anme;
        this.descrption = descrption;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    public String getAnme() {
        return anme;
    }

    public String getDescrption() {
        return descrption;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public double getPrice() {
        return price;
    }
}
