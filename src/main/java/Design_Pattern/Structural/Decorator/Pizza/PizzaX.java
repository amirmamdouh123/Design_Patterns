package main.java.Design_Pattern.Structural.Decorator.Pizza;

public class PizzaX implements Pizza{
    String Description="PizzaX contains a component ,b component,.... ";

    double cost=10.0;

    public PizzaX() {
    }

    public PizzaX(String description, double cost) {
        Description = description;
        this.cost = cost;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void OverAllDescription(){
        System.out.println(getDescription());
        System.out.println("Pizza cost: "+getCost());

    }
}
