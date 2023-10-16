package FlyweightPatterm;

public class CoffeeFlyWeight implements Coffee{
    private String flavor = null; // 内部状态

    public CoffeeFlyWeight(String flavor) {
        this.flavor = flavor;
    }

    @Override
    public void serveCoffee(String customization) { // 外部状态
        System.out.println("提供一杯" + flavor + "口味的咖啡，定制：" + customization);
    }
}
