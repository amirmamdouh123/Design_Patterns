package main.java.Design_Pattern.Structural.Decorator.Pizza;

public class PizzaZ implements Pizza{

    String Description="PizzaZ contains a component ,b component,.... ";

    double cost=20.0;


    public PizzaZ() {
    }

    public PizzaZ(String description, double cost) {
        Description = description;
        this.cost = cost;
    }

    public String getDescription() {
        return Description;
    }


    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }


    public void OverAllDescription() {
        System.out.println(getDescription());
        System.out.println("Pizza cost: " + getCost());
    }

}
