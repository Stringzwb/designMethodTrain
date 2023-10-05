package abstractFactoryPattern.coffee.Impl;

import abstractFactoryPattern.coffee.MilkCoffee;

public class MilkCoffeeBImpl implements MilkCoffee {

    @Override
    public void print() {
        System.out.println("我是牛奶咖啡B");
    }
}
