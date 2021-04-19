package jav.decorator_pattern.starbuzz;

public class Decaf extends Beverage{

    public Decaf(String sizeCup) {
        description = "Decaf";
        size = sizeCup;
    }

    @Override
    public double cost() {
        if(size.equals("S"))
            return 0.92;
        if(size.equals("B"))
            return 1.15;
        else
            return 1.05;
    }
}
