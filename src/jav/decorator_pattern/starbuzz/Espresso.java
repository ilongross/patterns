package jav.decorator_pattern.starbuzz;

public class Espresso extends Beverage{

    public Espresso(String sizeCup) {
        description = "Espresso";
        size = sizeCup;
    }

    @Override
    public double cost() {
        if(size.equals("S"))
            return 1.90;
        if(size.equals("B"))
            return 2.10;
        else
            return 1.99;
    }
}
