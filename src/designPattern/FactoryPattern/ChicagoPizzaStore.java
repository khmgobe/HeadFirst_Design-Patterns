package designPattern.FactoryPattern;

public class ChicagoPizzaStore extends PizzaStore {
    Pizza createPizza(String items) {
        if (items.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        }else return null;
    }
}
