package abstractFactoryPattern.factory;

import abstractFactoryPattern.coffee.MilkCoffee;
import abstractFactoryPattern.coffee.Tea;

public interface CoffeeFactory {
    MilkCoffee createMilkACoffee();
    MilkCoffee createMilkBCoffee();
    Tea createTea();
}
