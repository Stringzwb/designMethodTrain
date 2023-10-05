package abstractFactoryPattern;


import abstractFactoryPattern.coffee.MilkCoffee;
import abstractFactoryPattern.coffee.Tea;
import abstractFactoryPattern.factory.CoffeeFactory;
import abstractFactoryPattern.factory.Impl.CoffeeFactoryImpl;

public class coffeeTest {
    public static void main(String[] args) {
        CoffeeFactory cf = new CoffeeFactoryImpl();
        MilkCoffee milkACoffee = cf.createMilkACoffee();
        MilkCoffee milkBCoffee = cf.createMilkBCoffee();
        Tea tea = cf.createTea();
        milkACoffee.print();
        milkBCoffee.print();
        tea.print();
    }
}
