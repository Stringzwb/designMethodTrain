package abstractFactoryMethod;


import abstractFactoryMethod.coffee.MilkCoffee;
import abstractFactoryMethod.coffee.TeaCoffee;
import abstractFactoryMethod.factory.CoffeeFactory;
import abstractFactoryMethod.factory.Impl.CoffeeFactoryImpl;

public class coffeeTest {
    public static void main(String[] args) {
        CoffeeFactory cf = new CoffeeFactoryImpl();
        MilkCoffee milkACoffee = cf.createMilkACoffee();
        MilkCoffee milkBCoffee = cf.createMilkBCoffee();
        TeaCoffee teaCoffee = cf.createTeaCoffee();
        milkACoffee.print();
        milkBCoffee.print();
        teaCoffee.print();
    }
}
