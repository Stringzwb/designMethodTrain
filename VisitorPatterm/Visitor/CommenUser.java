package VisitorPatterm.Visitor;

import VisitorPatterm.People.Costomer;
import VisitorPatterm.People.Employee;

public class CommenUser implements Visitor{
    @Override
    public void visit(Costomer costomer) {
        System.out.println("顾客");
    }

    @Override
    public void visit(Employee employee) {
        System.out.println("员工姓名："+employee.getName());
    }
}
