package main.java.Design_Pattern.Structural.Composite.Organization.OrganizationComponents;

import java.util.List;

public interface OrganizationComponent {
    void showDetails();
    double calculateSalary();
    void add(OrganizationComponent component);
    void remove(OrganizationComponent component);
    List<OrganizationComponent> getSubordinates();
}
