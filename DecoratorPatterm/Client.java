package DecoratorPatterm;

public class Client {
    public static void main(String[] args) {
        CoffeeMaker coffeeMaker = new CoffeeMaker();
        NewCoffeeMaker newCoffeeMaker = new NewCoffeeMaker(coffeeMaker);
        newCoffeeMaker.addOperation();
    }
}
