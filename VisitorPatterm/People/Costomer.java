package VisitorPatterm.People;

import VisitorPatterm.Visitor.Visitor;

public class Costomer extends People{

    public Costomer(String name, String identity, int money) {
        super(name, identity, money);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
