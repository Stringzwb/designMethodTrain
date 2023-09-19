package abstractFactoryMethod.coffee.Impl;

import abstractFactoryMethod.coffee.TeaCoffee;

public class TeaCoffeeImpl implements TeaCoffee{


    @Override
    public void print() {
        System.out.println("我是茶咖啡");
    }
}
