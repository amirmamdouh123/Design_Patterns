package main.java.Design_Pattern.Creational.Factory_Method_Pattern.Factory_Class;

import main.java.Design_Pattern.Creational.Factory_Method_Pattern.BurgerTypes.BeffBurger;
import main.java.Design_Pattern.Creational.Factory_Method_Pattern.BurgerTypes.Burger;
import main.java.Design_Pattern.Creational.Factory_Method_Pattern.BurgerTypes.ChickenBurger;

public class BurgerFactory {

    public Burger createOrder(String burgerTypes){
        if(burgerTypes.equals("BEFF")){
            return new BeffBurger();
        }
        else if (burgerTypes.equals("Chicken")){
            return new ChickenBurger();
        }
        return null;
    }

}
