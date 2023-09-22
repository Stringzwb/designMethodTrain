package BuilderMethod.ConcreteBuilder;

import BuilderMethod.Builder.CoffeeBuilder;

public class CoffeeConcreteBuilder extends CoffeeBuilder {

    @Override
    public void buildMilkTea() {
        coffee.setName("奶茶");
        coffee.setPrice(15);
        coffee.setDescription("这是一杯奶茶");
    }

    @Override
    public void buildMeishi() {
        coffee.setName("美式");
        coffee.setPrice(20);
        coffee.setDescription("这是一杯美式");
    }

    @Override
    public void buildJuice() {
        coffee.setName("果汁");
        coffee.setPrice(10);
        coffee.setDescription("这是一杯果汁");
    }
}
