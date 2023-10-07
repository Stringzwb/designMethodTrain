package VisitorPatterm;

import VisitorPatterm.People.Costomer;
import VisitorPatterm.People.Employee;
import VisitorPatterm.Visitor.Boss;
import VisitorPatterm.Visitor.CommenUser;

public class ClientTest {
    public static void main(String[] args) {
        Costomer costomer1 = new Costomer("顾客a","VIP",200);
        Costomer costomer2 = new Costomer("顾客b","普通顾客",100);
        Employee employee1 = new Employee("员工a","实习生",2000);
        Employee employee2 = new Employee("员工b","正式工",4000);
        Boss boss = new Boss();
        CommenUser commenUser = new CommenUser();
        System.out.println("老板视角");
        boss.visit(costomer1);
        boss.visit(costomer2);
        boss.visit(employee1);
        boss.visit(employee2);
        System.out.println("游客视角");
        commenUser.visit(costomer1);
        commenUser.visit(costomer2);
        commenUser.visit(employee1);
        commenUser.visit(employee2);
    }
}
