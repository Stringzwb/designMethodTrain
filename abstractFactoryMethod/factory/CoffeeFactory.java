package abstractFactoryMethod.factory;

import abstractFactoryMethod.coffee.MilkCoffee;
import abstractFactoryMethod.coffee.Tea;

public interface CoffeeFactory {
    MilkCoffee createMilkACoffee();
    MilkCoffee createMilkBCoffee();
    Tea createTea();
}
