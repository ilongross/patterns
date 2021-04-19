package jav.decorator_pattern.starbuzz;

import jav.decorator_pattern.starbuzz.condiments.Mocha;
import jav.decorator_pattern.starbuzz.condiments.Whip;

public class StarbuzzCafe {
    public static void main(String[] args) {

        Beverage b1 = new DarkRoast("B");
//        System.out.println(b1.getDescription() + " = $" + b1.cost() + "\n");


        Beverage b2 = new Mocha(b1);
//        System.out.println(b2.getDescription() + " = $" + b2.cost() + "\n");
//
        Beverage b3 = new Whip(b2);
        System.out.println(b3.getDescription() + " = $" + b3.cost() + "\n");
//
        Beverage order1 = new Whip(new Mocha(new DarkRoast("B")));
        System.out.printf("Order:\n%s = $%.2f.\n", order1.getDescription(), order1.cost());
    }
}