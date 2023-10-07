package VisitorPatterm.People;

import VisitorPatterm.Visitor.Visitor;


public abstract class People {
    public String name;
    public String identity;
    public int money;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public People(String name, String identity, int money){
        this.name=name;
        this.identity=identity;
        this.money=money;
    }
    public abstract void accept(Visitor visitor);

}
