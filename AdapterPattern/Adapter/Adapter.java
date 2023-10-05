package AdapterPattern.Adapter;

import AdapterPattern.Adaptee.Adaptee;
import AdapterPattern.Target;

public class Adapter implements Target{
    public Adaptee adaptee;

    public Adapter(Adaptee adaptee){
        this.adaptee = adaptee;
    }

    @Override
    public void makeCoffee() {
        adaptee.makeIceCoffee();
    }
}
