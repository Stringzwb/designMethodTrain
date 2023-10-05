package BuilderPattern.Menus;

import BuilderPattern.Builder.CoffeeBuilder;
import BuilderPattern.CoffeeProduct.Coffee;
import BuilderPattern.ConcreteBuilder.CoffeeConcreteBuilder;

public class Menus {
    public static CoffeeBuilder coffeeBuilder=new CoffeeConcreteBuilder();

    public static Coffee getMilkTea(){
        coffeeBuilder.buildMilkTea();
        return coffeeBuilder.getCoffee();
    }

    public static Coffee getMeishi(){
        coffeeBuilder.buildMeishi();
        return coffeeBuilder.getCoffee();
    }

    public static Coffee getJuice(){
        coffeeBuilder.buildJuice();
        return coffeeBuilder.getCoffee();
    }


}
