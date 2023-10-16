package FlyweightPatterm;

public class Client {
    public static void main(String[] args) {
        CoffeeFactory coffeeFactory = new CoffeeFactory();

        // 第一个客户要一杯拿铁，加糖
        Coffee latte1 = coffeeFactory.getCoffeeFlavor("拿铁");
        latte1.serveCoffee("加糖");

        // 第二个客户也要一杯拿铁，不加糖
        Coffee latte2 = coffeeFactory.getCoffeeFlavor("拿铁");
        latte2.serveCoffee("不加糖");

        // 第三个客户要一杯美式，加糖和牛奶
        Coffee americano = coffeeFactory.getCoffeeFlavor("美式");
        americano.serveCoffee("加糖和牛奶");

    }
}
