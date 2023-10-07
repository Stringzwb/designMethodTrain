package VisitorPatterm.Visitor;

import VisitorPatterm.People.Costomer;
import VisitorPatterm.People.Employee;

public interface Visitor {
    void visit(Costomer costomer);

    void visit(Employee employee);
}
