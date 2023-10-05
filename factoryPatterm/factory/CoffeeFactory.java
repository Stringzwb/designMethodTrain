package factoryPatterm.factory;

import factoryPatterm.coffee.Coffee;
import factoryPatterm.coffee.Impl.MilkCoffee;
import factoryPatterm.coffee.Impl.Tea;

public class CoffeeFactory {
    public static Coffee createCoffee(String type){
        Coffee coffeeResult = null;
        if("milkCoffee".equals(type)){
            coffeeResult = MilkCoffee.createMilkCoffee();
        }else if("tea".equals(type)){
            coffeeResult = Tea.createTea();
        }
        return coffeeResult;
    }
}
