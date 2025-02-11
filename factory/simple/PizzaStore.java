public class PizzaStore extends PizzaFactory{
    @Override
    protected Pizza createPizza(String pizzaType) {
        if (pizzaType.equals("pepperoni")) {
            return new PepperoniPizza();
        } 

        if (pizzaType.equals("cheese")) {
            return new CheesePizza();
        }

        return null;
    }
}
