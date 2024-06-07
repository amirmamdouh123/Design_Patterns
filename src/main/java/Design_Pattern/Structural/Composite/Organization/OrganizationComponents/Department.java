package main.java.Design_Pattern.Structural.Composite.Organization.OrganizationComponents;

import java.util.ArrayList;
import java.util.List;

public class Department implements OrganizationComponent{

    String name;

    List<OrganizationComponent> subordinates=new ArrayList<>();

    public Department(String name, List<OrganizationComponent> subordinates) {
        this.name = name;
        this.subordinates = subordinates;
    }

    @Override
    public void showDetails() {
        System.out.println("Department: " + name);
        for (OrganizationComponent component : subordinates) {
            component.showDetails();
        }
    }

    @Override
    public double calculateSalary() {
        double totalSalary = 0;
        for (OrganizationComponent component : subordinates) {
            totalSalary += component.calculateSalary();
        }
        return totalSalary;
    }

    @Override
    public void add(OrganizationComponent component) {
        subordinates.add(component);
    }

    @Override
    public void remove(OrganizationComponent component) {
        subordinates.remove(component);
    }

    @Override
    public List<OrganizationComponent> getSubordinates() {
        return subordinates;
    }
}
