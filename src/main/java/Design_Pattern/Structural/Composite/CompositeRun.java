package main.java.Design_Pattern.Structural.Composite;

import main.java.Design_Pattern.Structural.Adapter.SoapToRestfulResponse.Services.SoapService;
import main.java.Design_Pattern.Structural.Adapter.SoapToRestfulResponse.SoapToRestAdapter;
import main.java.Design_Pattern.Structural.Composite.Army.Army;
import main.java.Design_Pattern.Structural.Composite.Army.Officer;
import main.java.Design_Pattern.Structural.Composite.Army.Solider;
import main.java.Design_Pattern.Structural.Composite.Organization.OrganizationComponents.Department;
import main.java.Design_Pattern.Structural.Composite.Organization.OrganizationComponents.Employee;
import main.java.Design_Pattern.Structural.Composite.Organization.OrganizationComponents.OrganizationComponent;

import java.util.ArrayList;
import java.util.List;

public class CompositeRun {


    public static void main(String[] args) throws IllegalAccessException {

//        Army solider1=new Solider();
//        Army solider2=new Solider();
//        Army solider3=new Solider();
//        Army solider4=new Solider();
//
//        Army officer1=new Officer();
//        Army officer2=new Officer();
//
//
//        officer1.add(solider1);
//        officer1.add(officer2);
//        officer2.add(solider2);
//        officer2.add(solider3);
//        officer2.add(solider4);
//
//
//        System.out.println(officer1.display());




        OrganizationComponent emp1=new Employee("dep1",10);
        OrganizationComponent emp2=new Employee("dep1",20);
        OrganizationComponent emp3=new Employee("dep1",30);
        OrganizationComponent emp4=new Employee("dep1",40);



        List<OrganizationComponent> subDep2= new ArrayList<>();
        subDep2.add(emp2);
        subDep2.add(emp4);


        OrganizationComponent dep2=new Department("dep2",subDep2);


        List<OrganizationComponent> subDep1= new ArrayList<>();
        subDep1.add(emp1);
        subDep1.add(emp3);
        subDep1.add(dep2);

        OrganizationComponent dep1=new Department("dep1",subDep1);

        dep1.showDetails();

    }
}




