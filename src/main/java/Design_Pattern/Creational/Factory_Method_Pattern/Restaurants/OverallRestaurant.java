package main.java.Design_Pattern.Creational.Factory_Method_Pattern.Restaurants;

import main.java.Design_Pattern.Creational.Factory_Method_Pattern.BurgerTypes.Burger;
import main.java.Design_Pattern.Creational.Factory_Method_Pattern.Factory_Class.BurgerFactory;

public class OverallRestaurant {
    BurgerFactory burgerFactory;
    public Burger createOrder(String burgerType){
        burgerFactory=new BurgerFactory();
        return burgerFactory.createOrder(burgerType);
    }
}
