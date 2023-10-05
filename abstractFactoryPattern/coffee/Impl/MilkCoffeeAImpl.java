package abstractFactoryPattern.coffee.Impl;

import abstractFactoryPattern.coffee.MilkCoffee;

public class MilkCoffeeAImpl implements MilkCoffee {

    @Override
    public void print() {
        System.out.println("我是牛奶咖啡A");
    }
}
