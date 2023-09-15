package factoryMethod.factory;

import factoryMethod.coffee.Coffee;
import factoryMethod.coffee.Impl.MilkCoffee;
import factoryMethod.coffee.Impl.TeaCoffee;

public class CoffeeFactory {
    public static Coffee createCoffee(String type){
        Coffee coffeeResult = null;
        if("milkCoffee".equals(type)){
            coffeeResult = MilkCoffee.createMilkCoffee();
        }else if("teaCoffee".equals(type)){
            coffeeResult = TeaCoffee.createTeaCoffee();
        }
        return coffeeResult;
    }
}
