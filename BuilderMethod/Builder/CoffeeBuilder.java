package BuilderMethod.Builder;

import BuilderMethod.CoffeeProduct.Coffee;

public abstract class CoffeeBuilder {
    public Coffee coffee = new Coffee() ;

    public abstract void buildMilkTea();
    public abstract void buildMeishi();
    public abstract void buildJuice();

    public Coffee getCoffee(){
        return coffee;
    }


}
