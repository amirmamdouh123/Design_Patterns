package main.java.Design_Pattern.Creational.Abstract_Factory_Method.Factories;

import main.java.Design_Pattern.Creational.Abstract_Factory_Method.Components.*;

public class AsuFactory implements AbstractFactory {


    @Override
    public Component createComponent(String componentType) {
        if(componentType.equals("gpu")){
            return new AsuGpu();
        }else if (componentType.equals("monitor")){
            return new AsuMonitor();
        }
        return null;
    }
}
