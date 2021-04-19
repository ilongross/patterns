package jav.decorator_pattern.starbuzz;

public class HouseBlend extends Beverage {

    public HouseBlend(String sizeCup) {
        description = "House Blend";
        size = sizeCup;
    }

    @Override
    public double cost() {
        if(size.equals("S"))
            return 0.80;
        if(size.equals("B"))
            return 1.00;
        else
            return 0.89;
    }
}
