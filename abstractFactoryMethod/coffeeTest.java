package abstractFactoryMethod;


import abstractFactoryMethod.coffee.MilkCoffee;
import abstractFactoryMethod.coffee.Tea;
import abstractFactoryMethod.factory.CoffeeFactory;
import abstractFactoryMethod.factory.Impl.CoffeeFactoryImpl;

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
