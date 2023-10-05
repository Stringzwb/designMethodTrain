package abstractFactoryPattern.coffee.Impl;

import abstractFactoryPattern.coffee.Tea;

public class TeaImpl implements Tea{


    @Override
    public void print() {
        System.out.println("我是茶");
    }
}
