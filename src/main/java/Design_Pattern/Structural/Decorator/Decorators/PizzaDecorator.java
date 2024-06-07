package main.java.Design_Pattern.Structural.Decorator.Decorators;

import main.java.Design_Pattern.Structural.Decorator.Pizza.Pizza;

public abstract class PizzaDecorator implements Pizza {

    Pizza pizzaDecorator;

    public String description;
    public double cost;

    public PizzaDecorator(Pizza pizzaDecorator) {
        this.pizzaDecorator = pizzaDecorator;
    }

    @Override
    public abstract String getDescription();

    @Override
    public abstract double getCost();



}
