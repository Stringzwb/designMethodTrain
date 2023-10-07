package VisitorPatterm.Visitor;

import VisitorPatterm.People.Costomer;
import VisitorPatterm.People.Employee;

public class Boss implements Visitor{
    @Override
    public void visit(Costomer costomer) {
        System.out.println("顾客姓名："+costomer.getName()+" 顾客身份："+costomer.getIdentity()+" 消费金额："+costomer.getMoney());
    }

    @Override
    public void visit(Employee employee) {
        System.out.println("员工姓名："+employee.getName()+" 员工身份："+employee.getIdentity()+" 员工工资："+employee.getMoney());
    }
}
