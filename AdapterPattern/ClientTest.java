package AdapterPattern;

import AdapterPattern.Adaptee.Adaptee;
import AdapterPattern.Adapter.Adapter;

public class ClientTest {

    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        Adapter adapter = new Adapter(adaptee);
        adapter.makeCoffee();
    }
}
