package factoryMethod;

import factoryMethod.coffee.Coffee;
import factoryMethod.factory.CoffeeFactory;

public class coffeeTest {
    public static void main(String[] args) {
        Coffee wantCoffee1 = CoffeeFactory.createCoffee("milkCoffee");
        Coffee wantCoffee2 = CoffeeFactory.createCoffee("teaCoffee");
    }
}
