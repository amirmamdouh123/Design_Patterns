package main.java.Design_Pattern.Structural.Decorator.Decorators;

import main.java.Design_Pattern.Structural.Decorator.Pizza.Pizza;

public class CheesePizzaDecorator extends PizzaDecorator{

    public CheesePizzaDecorator(Pizza pizzaDecorator) {
        super(pizzaDecorator);
    }

    @Override
    public String getDescription() {
        description= pizzaDecorator.getDescription()+", Biff";
        return description;
    }

    @Override
    public double getCost() {
        cost=pizzaDecorator.getCost()+5.0;
        return cost;
    }
}
