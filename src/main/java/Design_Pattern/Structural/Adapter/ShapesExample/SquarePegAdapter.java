package main.java.Design_Pattern.Structural.Adapter.ShapesExample;

import main.java.Design_Pattern.Structural.Adapter.ShapesExample.Shapes.RoundPeg;
import main.java.Design_Pattern.Structural.Adapter.ShapesExample.Shapes.SquarePeg;

public class SquarePegAdapter extends RoundPeg {

    SquarePeg squarePeg;

    public SquarePegAdapter(SquarePeg squarePeg){
        this.squarePeg=squarePeg;
    }

    @Override
    public double getRadius() {
        return squarePeg.getWidth()* Math.sqrt(2)/2;
    }
}
