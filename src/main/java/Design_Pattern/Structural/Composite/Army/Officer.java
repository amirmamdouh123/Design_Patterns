package main.java.Design_Pattern.Structural.Composite.Army;

import java.util.ArrayList;
import java.util.List;

public class Officer implements Army{

    List<Army> responsible_for = new ArrayList<>();

    public void add(Army army) {
        responsible_for.add(army);
    }

    public List<Army> getResponsible_for() {
        return responsible_for;
    }

    public void setResponsible_for(List<Army> responsible_for) {
        this.responsible_for = responsible_for;
    }

    @Override
    public String display() {
        StringBuilder x = new StringBuilder("Display the officer"+"\n");
        for (Army a:responsible_for) {
            x.append(a.display()+"\n");
        }
        return x.toString();
    }

    @Override
    public String forOfficersOnly() {
        return "Officer only";
    }
}
