package factoryPatterm;

import factoryPatterm.coffee.Coffee;
import factoryPatterm.factory.CoffeeFactory;

public class coffeeTest {
    public static void main(String[] args) {
        Coffee wantCoffee1 = CoffeeFactory.createCoffee("milkCoffee");
        Coffee wantCoffee2 = CoffeeFactory.createCoffee("tea");
    }
}
