package FlyweightPatterm;

import java.util.HashMap;

public class CoffeeFactory {
    private final HashMap<String, Coffee> flavors = new HashMap<>();

    public Coffee getCoffeeFlavor(String flavor) {
        Coffee coffee = flavors.get(flavor);
        if (coffee == null) {
            coffee = new CoffeeFlyWeight(flavor);
            flavors.put(flavor, coffee);
        }
        return coffee;
    }
}
