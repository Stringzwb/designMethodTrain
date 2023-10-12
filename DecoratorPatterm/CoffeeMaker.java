package DecoratorPatterm;

public class CoffeeMaker implements Staff{


    public CoffeeMaker() {
        System.out.println("我是咖啡师");
    }

    @Override
    public void makeCoffee() {
        System.out.println("做咖啡");
    }
}
