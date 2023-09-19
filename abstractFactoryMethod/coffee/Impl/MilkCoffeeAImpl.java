package abstractFactoryMethod.coffee.Impl;

import abstractFactoryMethod.coffee.MilkCoffee;

public class MilkCoffeeAImpl implements MilkCoffee {

    @Override
    public void print() {
        System.out.println("我是牛奶咖啡A");
    }
}
