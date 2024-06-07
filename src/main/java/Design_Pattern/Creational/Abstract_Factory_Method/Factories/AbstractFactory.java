package main.java.Design_Pattern.Creational.Abstract_Factory_Method.Factories;

import main.java.Design_Pattern.Creational.Abstract_Factory_Method.Components.Component;

public interface AbstractFactory {

    public Component createComponent(String componentType);
}
