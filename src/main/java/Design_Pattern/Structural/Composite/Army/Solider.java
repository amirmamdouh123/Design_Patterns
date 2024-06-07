package main.java.Design_Pattern.Structural.Composite.Army;

import java.util.List;

public class Solider implements Army{

    @Override
    public void add(Army army) throws IllegalAccessException {
        throw new IllegalAccessException();
    }

    @Override
    public List<Army> getResponsible_for() throws IllegalAccessException {
        throw new IllegalAccessException();
    }

    @Override
    public void setResponsible_for(List<Army> responsible_for) throws IllegalAccessException {
        throw new IllegalAccessException();
    }

    @Override
    public String display(){
        return "solider";
    }

    @Override
    public String forOfficersOnly() throws IllegalAccessException {
        throw new IllegalAccessException();
    }
}
