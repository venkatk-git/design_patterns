package factory.simple;

public class Main {
    public static void main(String[] args) {
        PizzaFactory pizzaStore = new PizzaStore();
        Pizza pepperoniPizza = pizzaStore.orderPizza("pepperoni");
    }
}