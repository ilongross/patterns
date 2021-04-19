package jav.decorator_pattern.starbuzz.condiments;

import jav.decorator_pattern.starbuzz.Beverage;
import jav.decorator_pattern.starbuzz.CondimentDecorator;

public class Soy extends CondimentDecorator {

    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getSize() {
        return beverage.getSize();
    }

    @Override
    public double cost() {
        double cost = 0.2;
        if(getSize().equals("S"))
            cost = 0.1;
        if(getSize().equals("B"))
            cost = 0.15;
        return beverage.cost() + cost;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " + Soy";
    }
}
