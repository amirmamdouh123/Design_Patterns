package main.java.Design_Pattern.Creational.Abstract_Factory_Method.Factories;

import main.java.Design_Pattern.Creational.Abstract_Factory_Method.Components.Component;
import main.java.Design_Pattern.Creational.Abstract_Factory_Method.Components.MsiGpu;
import main.java.Design_Pattern.Creational.Abstract_Factory_Method.Components.MsiMonitor;

public class MsiFactory implements AbstractFactory {


    @Override
    public Component createComponent(String componentType) {
        if(componentType.equals("gpu")){
            return new MsiGpu();
        }else if (componentType.equals("monitor")){
            return new MsiMonitor();
        }
        return null;
    }
}