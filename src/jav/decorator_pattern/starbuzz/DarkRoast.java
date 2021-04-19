package jav.decorator_pattern.starbuzz;

public class DarkRoast extends Beverage{

    public DarkRoast(String sizeCup) {
        description = "Dark Roast";
        size = sizeCup;
    }

    @Override
    public double cost() {
        if(size.equals("S"))
            return 0.92;
        if(size.equals("B"))
            return 1.15;
        else
            return 0.99;
    }
}
