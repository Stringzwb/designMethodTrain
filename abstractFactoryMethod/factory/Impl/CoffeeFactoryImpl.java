package abstractFactoryMethod.factory.Impl;

import abstractFactoryMethod.coffee.Impl.MilkCoffeeAImpl;
import abstractFactoryMethod.coffee.Impl.MilkCoffeeBImpl;
import abstractFactoryMethod.coffee.Impl.TeaCoffeeImpl;
import abstractFactoryMethod.coffee.MilkCoffee;
import abstractFactoryMethod.coffee.TeaCoffee;
import abstractFactoryMethod.factory.CoffeeFactory;

public class CoffeeFactoryImpl implements CoffeeFactory {

    @Override
    public MilkCoffee createMilkACoffee() {
        return new MilkCoffeeAImpl();
    }
    @Override
    public MilkCoffee createMilkBCoffee() {
        return new MilkCoffeeBImpl();
    }

    @Override
    public TeaCoffee createTeaCoffee() {
        return new TeaCoffeeImpl();
    }
}
