package factoryPatterm.coffee.Impl;

import factoryPatterm.coffee.Coffee;

public class MilkCoffee implements Coffee {
    public MilkCoffee(){
        System.out.println("我是牛奶咖啡");
    }

    public static MilkCoffee createMilkCoffee(){
        return new MilkCoffee();
    }
}
