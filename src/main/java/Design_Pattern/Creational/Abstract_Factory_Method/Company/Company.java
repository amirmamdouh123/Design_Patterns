package main.java.Design_Pattern.Creational.Abstract_Factory_Method.Company;

import main.java.Design_Pattern.Creational.Abstract_Factory_Method.Components.Component;
import main.java.Design_Pattern.Creational.Abstract_Factory_Method.Factories.AbstractFactory;
import main.java.Design_Pattern.Creational.Abstract_Factory_Method.Factories.AsuFactory;
import main.java.Design_Pattern.Creational.Abstract_Factory_Method.Factories.MsiFactory;

public class Company {
    AbstractFactory abstractFactory;

    String x;
    String y;
    String z;
    
     private Company(CompanyBuilder companyBuilder){
        this.abstractFactory= companyBuilder.abstractFactory;
        this.x=companyBuilder.x;
        this.y= companyBuilder.y;;
        this.z=companyBuilder.z;
    }
    
    public Component CreateGpu(String CompanyType ){
        if(CompanyType.equals("asu")){
            abstractFactory=new AsuFactory();
            return abstractFactory.createComponent("gpu");
        }
        else if (CompanyType.equals("msi")){
            abstractFactory=new MsiFactory();
            return abstractFactory.createComponent("gpu");
        }
        return null;
    }

    public Component CreateMonitor(String CompanyType ){
        if(CompanyType.equals("asu")){
            abstractFactory=new AsuFactory();
            return abstractFactory.createComponent("monitor");
        }
        else if (CompanyType.equals("msi")){
            abstractFactory=new MsiFactory();
            return abstractFactory.createComponent("monitor");
        }
        return null;
    }

    public CompanyBuilder builder(){
        return new CompanyBuilder();
    }
    
    public class CompanyBuilder{

        AbstractFactory abstractFactory;

        String x;
        String y;
        String z;

        public CompanyBuilder setAbstractFactory(AbstractFactory abstractFactory) {
            this.abstractFactory = abstractFactory;
            return this;
        }

        public CompanyBuilder setX(String x) {
            this.x = x;
            return this;
        }

        public CompanyBuilder setY(String y) {
            this.y = y;
            return this;
        }

        public CompanyBuilder setZ(String z) {
            this.z = z;
            return this;
        }

        public Company build(){
            return new Company(this);
        }

    }


}
