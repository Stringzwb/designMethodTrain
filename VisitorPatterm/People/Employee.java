package VisitorPatterm.People;

import VisitorPatterm.Visitor.Visitor;

public class Employee extends People{


    public Employee(String name, String identity, int money) {
        super(name, identity, money);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
