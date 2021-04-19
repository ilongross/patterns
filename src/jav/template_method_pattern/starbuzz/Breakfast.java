package jav.template_method_pattern.starbuzz;

import java.util.ArrayList;
import java.util.List;

public class Breakfast {
    public static void main(String[] args) {
        HotDrink tea = new SubTea();
        HotDrink coffee = new SubCoffee();
        HotDrink coffeeHook = new CoffeeWithHook();
        List<HotDrink> drinks = new ArrayList<>();
        drinks.add(tea);
        drinks.add(coffee);
        drinks.add(coffeeHook);
        for (HotDrink drink : drinks) {
            System.out.println(drink.getClass().getSimpleName());
            drink.prepareRecipe();
            System.out.println();
        }
    }
}
