package CompositePatterm;

import CompositePatterm.Composite.CafeOrg;
import CompositePatterm.People.People;

public class Client {
    public static void main(String[] args) {
        CafeOrg headCafe = new CafeOrg(1, "咖啡厅");
        CafeOrg cashier = new CafeOrg(2, "收银台");
        CafeOrg waiter = new CafeOrg(3, "服务生");
        CafeOrg drink = new CafeOrg(4, "饮品部");
        People boss = new People(1, "boss");
        People a = new People(2, "小a");
        People b = new People(3, "小b");
        People c = new People(4, "小c");
        People d = new People(5, "小d");
        People e = new People(6, "小e");
        headCafe.addOrg(cashier);
        headCafe.addOrg(waiter);
        headCafe.addOrg(drink);
        headCafe.addPeople(boss);
        cashier.addPeople(a);
        waiter.addPeople(b);
        waiter.addPeople(c);
        drink.addPeople(d);
        drink.addPeople(e);
        waiter.removePeople(3);
        headCafe.show();
    }
}