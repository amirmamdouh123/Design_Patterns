package main.java.Design_Pattern.Structural.Composite.Army;

import java.util.ArrayList;
import java.util.List;

public interface Army {
    List<Army> responsible_for = null;

    public void add(Army army) throws IllegalAccessException;

    public List<Army> getResponsible_for() throws IllegalAccessException;

    public void setResponsible_for(List<Army> responsible_for) throws IllegalAccessException;


    public String display();

    public String forOfficersOnly() throws IllegalAccessException;



}
