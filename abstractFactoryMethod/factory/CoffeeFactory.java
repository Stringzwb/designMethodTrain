package abstractFactoryMethod.factory;

import abstractFactoryMethod.coffee.MilkCoffee;
import abstractFactoryMethod.coffee.TeaCoffee;

public interface CoffeeFactory {
    MilkCoffee createMilkACoffee();
    MilkCoffee createMilkBCoffee();
    TeaCoffee createTeaCoffee();
}
