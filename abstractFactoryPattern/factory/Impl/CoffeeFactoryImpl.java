package abstractFactoryPattern.factory.Impl;

import abstractFactoryPattern.coffee.Impl.MilkCoffeeAImpl;
import abstractFactoryPattern.coffee.Impl.MilkCoffeeBImpl;
import abstractFactoryPattern.coffee.Impl.TeaImpl;
import abstractFactoryPattern.coffee.MilkCoffee;
import abstractFactoryPattern.coffee.Tea;
import abstractFactoryPattern.factory.CoffeeFactory;

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
    public Tea createTea() {
        return new TeaImpl();
    }
}
