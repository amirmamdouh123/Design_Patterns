package main.java.Design_Pattern.Structural.Composite.Organization.OrganizationComponents;

import java.util.List;

public class Employee implements OrganizationComponent{

    String name;

    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }



    @Override
    public void showDetails() {
        System.out.println("Employee: "+name+" , Salary: "+salary);
    }

    @Override
    public double calculateSalary() {
        return 10;
    }

    @Override
    public void add(OrganizationComponent component) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void remove(OrganizationComponent component) {
        throw new UnsupportedOperationException();

    }

    @Override
    public List<OrganizationComponent> getSubordinates() {
        throw new UnsupportedOperationException();
    }
}
